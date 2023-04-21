package com.acme.statusmgr.beans;

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
        return super.getStatusDesc() + String.format(", and the JRE version is %s", Runtime.version().toString());
    }

    @Override
    public int getRequestCost() {
        return super.getRequestCost() + COST;
    }
}
