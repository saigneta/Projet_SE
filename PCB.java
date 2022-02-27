/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Foumilayo
 */

/*duree passage = turnaroundtime
duree d'attente = waiting time
duration = trusttime
*/
public class PCB
{
    private int id;
    private int duration;
    private int remainingTime;
    private String programName;
    private int priority;
    private int userId;
    private int arrivalTime;
    private int dureeAttente;
    private int dureePassage;
    
    
    
    
    
     
    
    private PCB(int id, int duration, int remainingTime, String programName, int priority,int userId, int arrivalTime, int dureeAttente, int dureePassage)
    {
        this.id = id;
        this.duration = duration;
        this.remainingTime =remainingTime;
        this.programName = programName;
        this.priority = priority;
        this.userId = userId;
        this.arrivalTime = arrivalTime;
        this.dureeAttente = dureeAttente;
        this.dureePassage = dureePassage;
        
        
        
        }
    
    public PCB(int id, int duration,String programName, int priority,int userId,  int arrivalTime)
    {
        this(id, duration,0,programName, priority,userId,arrivalTime, 0, 0 );
    }

    

   

    
    
    /*public PCB(int id, String programName, int arrivalTime, int duration,   int userId)
    {
        this(id, programName, arrivalTime, duration, 0, 0, 0, userId);
    }
    */

    public int getId()
    {
        return this.id;
    }
     public void setId(int id)
    {
        this.id = id;
    }
     
     public int getDuration()
    {
        return this.duration;
    }
    
    public void setDuration(int duration)
    {
        this.duration = duration;
    }
    
    public int getRemainingTime()
    {
        return this.remainingTime;
    }
    
    public void setRemainingTime(int remainingTime)
    {
        this.remainingTime = remainingTime;
    }
    
    public String getProgramName()
    {
        return this.programName;
    }
    
    public void setProgramName(String programName)
    {
        this.programName = programName;
    }
     public int getPriority()
    {
        return this.priority;
    }
    public void setPriority(int priority)
    {
        this.priority = priority;
    }
    
    public int getUserId()
    {
        return this.userId;
    }
     public void setUserId(int userId)
    {
        this.userId = userId;
    }
    
    public int getArrivalTime()
    {
        return this.arrivalTime;
    }
    public void setArrivalTime(int arrivalTime)
    {
        this.arrivalTime = arrivalTime;
    }
    
    public int getDureeAttente()
    {
        return this.dureeAttente;
    }
    public void setDureeAttente(int dureeAttente)
    {
        this.dureeAttente = dureeAttente;
    }
    
    public int getDureePassage()
    {
        return this.dureePassage;
    }
    public void setDureePassage(int dureePassage)
    {
        this.dureePassage = dureePassage;
    }
    
 }
