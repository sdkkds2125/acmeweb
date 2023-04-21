package com.acme.statusmgr.beans;

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
        return super.getStatusDesc() + String.format(", and there are %d processors available", Runtime.getRuntime().availableProcessors());
    }

    @Override
    public int getRequestCost(){
        return super.getRequestCost() + COST;
    }
}
