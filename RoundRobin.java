/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Foumilayo
 */

import java.util.ArrayList;
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
            List<PCB> availableRows = new ArrayList();
            
            for (PCB row : pcbs)
            {
                if (row.getArrivalTime() <= time)
                {
                    availableRows.add(row);
                }
            }
            
            Collections.sort(availableRows, (Object o1, Object o2) -> {
                if (((PCB) o1).getPriority()== ((PCB) o2).getPriority())
                {
                    return 0;
                }
                else if (((PCB) o1).getPriority() < ((PCB) o2).getPriority())
                {
                    return -1;
                }
                else
                {
                    return 1;
                }
            });
            
            PCB row = availableRows.get(0);
            this.getTimeline().add(new Event(row.getProgramName(), time, ++time));
            row.setDuration(row.getDuration() - 1);
            
            if (row.getDuration() == 0)
            {
                for (int i = 0; i < pcbs.size(); i++)
                {
                    if (pcbs.get(i).getProgramName().equals(row.getProgramName()))
                    {
                        pcbs.remove(i);
                        break;
                    }
                }
            }
        }
        
        for (int i = this.getTimeline().size() - 1; i > 0; i--)
        {
            List<Event> timeline = this.getTimeline();
            
            if (timeline.get(i - 1).getProgramName().equals(timeline.get(i).getProgramName()))
            {
                timeline.get(i - 1).setFinishTime(timeline.get(i).getFinishTime());
                timeline.remove(i);
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
