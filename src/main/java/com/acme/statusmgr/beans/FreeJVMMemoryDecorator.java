package com.acme.statusmgr.beans;

import com.acme.statusmgr.SystemStatusFacade;
import com.acme.statusmgr.SystemStatusRetrieverInterface;

public class FreeJVMMemoryDecorator extends AbstractStatusDecorator {
    final int COST = 7;
    private SystemStatusRetrieverInterface ssri;
    public FreeJVMMemoryDecorator(AbstractServerStatus s,SystemStatusRetrieverInterface ssri) {
        super(s);
        this.ssri = ssri;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + ssri.getFreeJvmMemory();
    }

    @Override
    public int getRequestCost() {
        return super.getRequestCost() + COST;
    }
}


