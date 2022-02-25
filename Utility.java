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

public class Utility
{
    public static List<PCB> deepCopy(List<PCB> oldList)
    {
        List<PCB> newList = new ArrayList();
        
        for (PCB pcb : oldList)
        {
            newList.add(new PCB(pcb.getId(), pcb.getDuration(), pcb.getProgramName(),pcb.getPriority(),pcb.getUserId(), pcb.getArrivalTime()));
        }
        
        return newList;
    }
}

