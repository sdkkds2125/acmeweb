package com.acme.statusmgr;

public class StatusDecoratorFacade {
    public static String getCurrentServerStatus() {
        return "up";
    }

    public static String getAvailableProcessors() {
        return String.format(", and there are %d processors available", Runtime.getRuntime().availableProcessors());
    }

    public static String getFreeJvmMemory() {
        return String.format(", and there are %d bytes of JVM memory free", Runtime.getRuntime().freeMemory());
    }

    public static String getTotalJvmMemory() {
        return String.format(", and there is a total of %d bytes of memory", Runtime.getRuntime().totalMemory());
    }

    public static String getJreVersion() {
        return String.format(", and the JRE version is %s", Runtime.version().toString());
    }

    public static String getTempLocation() {
        return String.format(", and the server's temp file location is %s", System.getenv("TEMP"));
    }
}
