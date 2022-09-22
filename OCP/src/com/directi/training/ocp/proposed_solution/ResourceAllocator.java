package com.directi.training.ocp.proposed_solution;

public class ResourceAllocator
{

    public int allocate(Resource resource)
    {
        int resourceId;
        resourceId = resource.findFreeResource();
        resource.markResourceBusy();
        return resourceId;
    }

    public void free(Resource resource, int resourceId)
    {
       resource.markResourceFree(resourceId);
    }
}
