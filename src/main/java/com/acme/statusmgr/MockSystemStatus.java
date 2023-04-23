package com.acme.statusmgr;

public class MockSystemStatus implements SystemStatusRetrieverInterface {
    @Override
    public String getCurrentServerStatus() {
        return "up";
    }

    @Override
    public String getAvailableProcessors() {
        return String.format(", and there are %d processors available", 4);
    }

    @Override
    public String getFreeJvmMemory() {
        return String.format(", and there are %d bytes of JVM memory free", 127268272);
    }

    @Override
    public String getTotalJvmMemory() {
        return String.format(", and there is a total of %d bytes of JVM memory", 159383552);
    }

    @Override
    public String getJreVersion() {
        return String.format(", and the JRE version is %s", "15.0.2+7-27");
    }

    @Override
    public String getTempLocation() {
        return String.format(", and the server's temp file location is %s", "M:\\\\AppData\\\\Local\\\\Temp");
    }
}
