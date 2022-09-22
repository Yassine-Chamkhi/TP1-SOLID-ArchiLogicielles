package com.directi.training.ocp.proposed_solution;

public class TimeSlot implements Resource{
    public void markResourceBusy(){};
    public void markResourceFree(int resourceId){};
    public int findFreeResource(){
        return 0;
    }
}
