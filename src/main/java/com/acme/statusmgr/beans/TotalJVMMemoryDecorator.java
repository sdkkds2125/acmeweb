package com.acme.statusmgr.beans;

public class TotalJVMMemoryDecorator extends AbstractStatusDecorator {
    final int COST = 13;

    public TotalJVMMemoryDecorator(AbstractServerStatus s) {
        super(s);

    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + String.format(", and there is a total of %d bytes of JVM memory", Runtime.getRuntime().totalMemory());
    }

    @Override
    public int getRequestCost() {
        return super.getRequestCost() + COST;
    }
}



