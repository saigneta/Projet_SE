/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Foumilayo
 */

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoundRobin extends CPUProgram
{
    @Override
    public void process()
    {
        Collections.sort(this.getPCBs(), (Object o1, Object o2) -> {
            if (((PCB) o1).getArrivalTime() == ((PCB) o2).getArrivalTime())
            {
                return 0;
            }
            else if (((PCB) o1).getArrivalTime() < ((PCB) o2).getArrivalTime())
            {
                return -1;
            }
            else
            {
                return 1;
            }
        });
        
        List<PCB> pcbs = Utility.deepCopy(this.getPCBs());
        int time = pcbs.get(0).getArrivalTime();
        int timeQuantum = this.getTimeQuantum();
        
        while (!pcbs.isEmpty())
        {
            PCB pcb = pcbs.get(0);
            int bt = (pcb.getDuration() < timeQuantum ? pcb.getDuration() : timeQuantum);
            this.getTimeline().add(new Event(pcb.getProgramName(), time, time + bt));
            time += bt;
            pcbs.remove(0);
            
            if (pcb.getDuration() > timeQuantum)
            {
                pcb.setDuration(pcb.getDuration() - timeQuantum);
                
                for (int i = 0; i < pcbs.size(); i++)
                {
                    if (pcbs.get(i).getArrivalTime() > time)
                    {
                        pcbs.add(i, pcb);
                        break;
                    }
                    else if (i == pcbs.size() - 1)
                    {
                        pcbs.add(pcb);
                        break;
                    }
                }
            }
        }
        
        Map map = new HashMap();
        
        for (PCB pcb : this.getPCBs())
        {
            map.clear();
            
            for (Event event : this.getTimeline())
            {
                if (event.getProgramName().equals(pcb.getProgramName()))
                {
                    if (map.containsKey(event.getProgramName()))
                    {
                        int w = event.getStartTime() - (int) map.get(event.getProgramName());
                        pcb.setDureeAttente(pcb.getDureeAttente() + w);
                    }
                    else
                    {
                        pcb.setDureeAttente(event.getStartTime() - pcb.getArrivalTime());
                    }
                    
                    map.put(event.getProgramName(), event.getFinishTime());
                }
            }
            
            pcb.setDureePassage(pcb.getDureeAttente() + pcb.getDuration());
        }
    }
}
