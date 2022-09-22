package com.directi.training.ocp.proposed_solution;

public interface Resource {
    public void markResourceFree(int resourceId);
    public void markResourceBusy();
    public int findFreeResource();
}
