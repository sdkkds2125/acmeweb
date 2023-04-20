package com.acme.statusmgr.beans;

public class TempLocationDecorator extends AbstractStatusDecorator{
    final int COST = 29;

    public TempLocationDecorator(AbstractServerStatus s) {
        super(s);

    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + String.format(", and the server's temp file location is %s", System.getenv("TEMP"));
    }

    @Override
    public int getRequestCost(){
        return super.getRequestCost() + COST;
    }
}
