package com.acme.statusmgr.beans;

import com.acme.statusmgr.StatusDecoratorFacade;

public class FreeJVMMemoryDecorator extends AbstractStatusDecorator {
    final int COST = 7;

    public FreeJVMMemoryDecorator(AbstractServerStatus s) {
        super(s);

    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + StatusDecoratorFacade.getFreeJvmMemory();
    }

    @Override
    public int getRequestCost() {
        return super.getRequestCost() + COST;
    }
}


