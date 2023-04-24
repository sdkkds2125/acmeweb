package com.acme.statusmgr.beans;

import com.acme.statusmgr.SystemStatusRetrieverInterface;

public class TotalJVMMemoryDecorator extends AbstractStatusDecorator {
    final int COST = 13;
    private SystemStatusRetrieverInterface ssri;
    public TotalJVMMemoryDecorator(AbstractServerStatus s, SystemStatusRetrieverInterface ssri) {
        super(s);
        this.ssri = ssri;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + ssri.getTotalJvmMemory();
    }

    @Override
    public int getRequestCost() {
        return super.getRequestCost() + COST;
    }
}



