package com.acme.statusmgr.beans;

import com.acme.statusmgr.SystemStatusFacade;
import com.acme.statusmgr.SystemStatusRetrieverInterface;
import org.springframework.web.bind.annotation.RequestParam;

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