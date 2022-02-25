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
import java.util.List;

public abstract class CPUProgram
{
    private final List<PCB> pcbs;
    private final List<Event> timeline;
    private int timeQuantum;
    
    public CPUProgram()
    {
        pcbs = new ArrayList();
        timeline = new ArrayList();
        timeQuantum = 1;
    }
    
    public boolean add(PCB pcb)
    {
        return pcbs.add(pcb);
    }
    
    public void setTimeQuantum(int timeQuantum)
    {
        this.timeQuantum = timeQuantum;
    }
    
    public int getTimeQuantum()
    {
        return timeQuantum;
    }
    
    
    
    public Event getEvent(PCB pcb)
    {
        for (Event event : timeline)
        {
            if (pcb.getProgramName().equals(event.getProgramName()))
            {
                return event;
            }
        }
        
        return null;
    }
    
    public PCB getPCB(String process)
    {
        for (PCB pcb : pcbs)
        {
            if (pcb.getProgramName().equals(process))
            {
                return pcb;
            }
        }
        
        return null;
    }
    
    public List<PCB> getPCBs()
    {
        return pcbs;
    }
    
    public List<Event> getTimeline()
    {
        return timeline;
    }
    
    public abstract void process();
}

