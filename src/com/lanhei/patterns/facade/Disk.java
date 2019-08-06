package com.lanhei.patterns.facade;

import com.sun.istack.internal.logging.Logger;

public class Disk {
    public static final Logger LOGGER = Logger.getLogger(Disk.class);

    public void start()
    {
        LOGGER.info("Disk is start...");
    }

    public void shutDown()
    {
        LOGGER.info("Disk is shutDown...");
    }
}
