package com.acme.statusmgr.beans;

import com.acme.statusmgr.SystemStatusFacade;
import com.acme.statusmgr.SystemStatusRetrieverInterface;

public class TempLocationDecorator extends AbstractStatusDecorator {
    final int COST = 29;
    private SystemStatusRetrieverInterface ssri;
    public TempLocationDecorator(AbstractServerStatus s, SystemStatusRetrieverInterface ssri) {
        super(s);
        this.ssri = ssri;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + ssri.getTempLocation();
    }

    @Override
    public int getRequestCost() {
        return super.getRequestCost() + COST;
    }
}
