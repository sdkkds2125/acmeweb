package com.acme.statusmgr.beans;

import com.acme.statusmgr.StatusDecoratorFacade;

public class JreVersionDecorator extends AbstractStatusDecorator {
    final int COST = 19;

    public JreVersionDecorator(AbstractServerStatus s) {
        super(s);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + StatusDecoratorFacade.getJreVersion();
    }

    @Override
    public int getRequestCost() {
        return super.getRequestCost() + COST;
    }
}
