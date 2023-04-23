package com.acme.statusmgr.beans;

import com.acme.statusmgr.SystemStatusFacade;
import com.acme.statusmgr.SystemStatusRetrieverInterface;

public class JreVersionDecorator extends AbstractStatusDecorator {
    final int COST = 19;
    private SystemStatusRetrieverInterface ssri;
    public JreVersionDecorator(AbstractServerStatus s, SystemStatusRetrieverInterface ssri) {
        super(s);
        this.ssri = ssri;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + ssri.getJreVersion();
    }

    @Override
    public int getRequestCost() {
        return super.getRequestCost() + COST;
    }
}
