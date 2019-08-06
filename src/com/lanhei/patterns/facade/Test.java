package com.lanhei.patterns.facade;

import com.sun.istack.internal.logging.Logger;

public class Test {
    public static final Logger LOGGER = Logger.getLogger(Test.class);

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
        LOGGER.info("=================");
        computer.shutDown();
    }
}
