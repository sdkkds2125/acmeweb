package com.acme.statusmgr;

public interface SystemStatusRetrieverInterface {
    String getCurrentServerStatus();

    String getAvailableProcessors();

    String getFreeJvmMemory();

    String getTotalJvmMemory();

    String getJreVersion();

    String getTempLocation();
}
