package com.acme.statusmgr.beans;

import com.acme.statusmgr.SystemStatusFacade;
import com.acme.statusmgr.SystemStatusRetrieverInterface;

public class AvailableProcessorsDecorator extends AbstractStatusDecorator {
    final int COST = 3;
    private SystemStatusRetrieverInterface ssri;
    public AvailableProcessorsDecorator(AbstractServerStatus s, SystemStatusRetrieverInterface ssri) {
        super(s);
        this.ssri = ssri;
 }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public String getStatusDesc() {
        return super.getStatusDesc() + ssri.getAvailableProcessors();
    }

    @Override
    public int getRequestCost(){
        return super.getRequestCost() + COST;
    }
}
