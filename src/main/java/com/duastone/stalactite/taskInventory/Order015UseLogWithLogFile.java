package com.duastone.stalactite.taskInventory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Order 15: Use log with log file
 * Created by Quesle on 10/08/2017.
 */
public class Order015UseLogWithLogFile {

    private final Logger logger = LoggerFactory.getLogger(Order015UseLogWithLogFile.class);

    public void printLog() {
        logger.info("Request Parameter {}: {}", "first", "second");
        logger.debug("Request Parameter {}: {}", "first", "second");
        logger.error("Request Parameter {}: {}", "first", "second");
    }
}
