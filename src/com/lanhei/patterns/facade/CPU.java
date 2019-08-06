package com.lanhei.patterns.facade;
import com.sun.istack.internal.logging.Logger;

public class CPU {
    public static final Logger LOGGER = Logger.getLogger(CPU.class);

    public void start()
    {
        LOGGER.info("cpu is start...");
    }

    public void shutDown()
    {
        LOGGER.info("CPU is shutDown...");
    }
}
