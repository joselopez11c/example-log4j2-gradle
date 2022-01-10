package com.coderhouse;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class HelloExample {

    final static Logger logger = LogManager.getLogger(HelloExample.class);

    public static void main(String[] args) {
        HelloExample helloExampe = new HelloExample();
        helloExampe.runMe("test");
    }

    private void runMe(String parameter) {
        if (logger.isDebugEnabled()) {
            logger.debug("This is debug : {} ", parameter);
        }

        if (logger.isInfoEnabled()) {
            logger.info("This is info : {} ", parameter);
        }

        logger.warn("This is warn : {} ", parameter);
        logger.error("This is error : {} ", parameter);
    }

}
