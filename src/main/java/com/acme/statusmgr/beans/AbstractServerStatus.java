package com.acme.statusmgr.beans;

public abstract class AbstractServerStatus {

    public abstract long getId();

    public abstract String getContentHeader();

    public abstract String getStatusDesc();

    public abstract int getRequestCost();
}
