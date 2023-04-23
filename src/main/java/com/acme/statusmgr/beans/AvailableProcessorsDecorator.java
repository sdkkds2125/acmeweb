package com.acme.statusmgr.beans;

import com.acme.statusmgr.StatusDecoratorFacade;

public class AvailableProcessorsDecorator extends AbstractStatusDecorator {
    final int COST = 3;

    public AvailableProcessorsDecorator(AbstractServerStatus s) {
        super(s);

    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + StatusDecoratorFacade.getAvailableProcessors();
    }

    @Override
    public int getRequestCost(){
        return super.getRequestCost() + COST;
    }
}
