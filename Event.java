/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Foumilayo
 */

public class Event
{
    private final String programName;
    private final int startTime;
    private int finishTime;
    
    public Event(String programName, int startTime, int finishTime)
    {
        this.programName = programName;
        this.startTime = startTime;
        this.finishTime = finishTime;
    }
    
    public String getProgramName()
    {
        return programName;
    }
    
    public int getStartTime()
    {
        return startTime;
    }
    
    public int getFinishTime()
    {
        return finishTime;
    }
    
    public void setFinishTime(int finishTime)
    {
        this.finishTime = finishTime;
    }
}
