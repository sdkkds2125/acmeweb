package com.acme.statusmgr.beans;

abstract class AbstractStatusDecorator extends AbstractServerStatus {
    private final AbstractServerStatus statusToBeDecorated;

    public AbstractStatusDecorator(AbstractServerStatus statusToBeDecorated) {
        this.statusToBeDecorated = statusToBeDecorated;
    }

    @Override
    public String getContentHeader() {
        return statusToBeDecorated.getContentHeader();
    }

    @Override
    public String getStatusDesc() {
        return statusToBeDecorated.getStatusDesc();
    }

    @Override
    public int getRequestCost() {
        return statusToBeDecorated.getRequestCost();
    }

    @Override
    public long getId(){
        return statusToBeDecorated.getId();
    }
}