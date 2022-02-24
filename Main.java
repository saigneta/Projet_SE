/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Foumilayo
 */

import static com.sun.javafx.css.SizeUnits.PC;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        
        
        System.out.println("-----------------RR------------------");
        rr();
    }
    
    
   
    
    public static void rr()
    {
        CPUProgram rr = new RoundRobin();
        rr.setTimeQuantum(2);
        rr.add(new PCB(1,1,"P1", 8, 1,1));
        rr.add(new PCB(2,2,"P2", 5, 1,6));
        rr.add(new PCB(4,4,"P4", 4, 3,5));
        rr.add(new PCB(3,3,"P3", 2, 7,2));
        rr.add(new PCB(5,5,"P5", 2, 8,4));
        rr.add(new PCB(6,6,"P6", 4, 2,3));
        rr.add(new PCB(7,7,"P7", 3, 5,4));
        rr.process();
        display(rr);
    }
    
    public static void display(CPUProgram object)
    {
        System.out.println("Process\tAT\tBT\tWT\tTAT");

        object.getPCBs().forEach((pcb) -> {
            System.out.println(pcb.getId() + "\t" + pcb.getDuration() + "\t"+  pcb.getRemainingTime() + "\t"+ pcb.getProgramName() + "\t" + pcb.getPriority() + "\t"+ pcb.getUserId() + "\t"+ pcb.getArrivalTime() + "\t"  + pcb.getDureeAttente() + "\t" + pcb.getDureePassage());
        });
        
        System.out.println();
        
        for (int i = 0; i < object.getTimeline().size(); i++)
        {
            List<Event> timeline = object.getTimeline();
            System.out.print(timeline.get(i).getStartTime() + "(" + timeline.get(i).getProgramName() + ")");
            
            if (i == object.getTimeline().size() - 1)
            {
                System.out.print(timeline.get(i).getFinishTime());
            }
        }
        
        
    }
}

