package com.acme.statusmgr.beans;

import com.acme.statusmgr.SystemStatusFacade;
import com.acme.statusmgr.SystemStatusRetrieverInterface;

public abstract class AbstractServerStatus {


    public abstract long getId();

    public abstract String getContentHeader();

    public abstract String getStatusDesc();

    public abstract int getRequestCost();

}
