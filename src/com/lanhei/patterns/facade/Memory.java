package com.lanhei.patterns.facade;

import com.sun.istack.internal.logging.Logger;

public class Memory {
    public static final Logger LOGGER = Logger.getLogger(Memory.class);

    public void start()
    {
        LOGGER.info("Memory is start...");
    }

    public void shutDown()
    {
        LOGGER.info("Memory is shutDown...");
    }
}
