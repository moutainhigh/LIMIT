package com.limit.common;

public class Constants {


    public static final String THREAD_POOL_NAME = "Limit";
    private final static int CPUS = Runtime.getRuntime().availableProcessors();
    public static final Integer DEFAULT_CORE_THREADS =  CPUS + 1;
    public static final Integer DEFAULT_MAX_THREADS = (CPUS + 1) * 2;
    public static final Integer DEFAULT_BLOCKING_QUEUE = 0;
    public static final Integer DEFAULT_ALIVE_TIME = 60 * 1000;
}
