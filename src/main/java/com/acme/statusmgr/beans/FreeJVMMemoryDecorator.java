package com.acme.statusmgr.beans;

public class FreeJVMMemoryDecorator  extends AbstractStatusDecorator {
    final int COST = 7;

    public FreeJVMMemoryDecorator(AbstractServerStatus s) {
        super(s);

    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + String.format(", and there is a total of %d bytes of JVM memory free", Runtime.getRuntime().freeMemory());
    }

    @Override
    public int getRequestCost(){
        return super.getRequestCost() + COST;
    }
}


