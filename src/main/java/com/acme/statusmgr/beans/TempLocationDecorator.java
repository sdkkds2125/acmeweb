package com.acme.statusmgr.beans;

import com.acme.statusmgr.StatusDecoratorFacade;

public class TempLocationDecorator extends AbstractStatusDecorator {
    final int COST = 29;

    public TempLocationDecorator(AbstractServerStatus s) {
        super(s);

    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + StatusDecoratorFacade.getTempLocation();
    }

    @Override
    public int getRequestCost() {
        return super.getRequestCost() + COST;
    }
}
