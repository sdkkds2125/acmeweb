package com.acme.statusmgr;

public class SystemStatusFacade implements SystemStatusRetrieverInterface {


    public String getCurrentServerStatus() {
        return "up";
    }

    @Override
    public String getAvailableProcessors() {
        return String.format(", and there are %d processors available", Runtime.getRuntime().availableProcessors());
    }

    @Override
    public String getFreeJvmMemory() {
        return String.format(", and there are %d bytes of JVM memory free", Runtime.getRuntime().freeMemory());
    }

    @Override
    public String getTotalJvmMemory() {
        return String.format(", and there is a total of %d bytes of memory", Runtime.getRuntime().totalMemory());
    }

    @Override
    public String getJreVersion() {
        return String.format(", and the JRE version is %s", Runtime.version().toString());
    }

    @Override
    public String getTempLocation() {
        return String.format(", and the server's temp file location is %s", System.getenv("TEMP"));
    }
}
