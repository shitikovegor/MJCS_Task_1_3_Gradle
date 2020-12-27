package com.shitikov.task13.core;

import com.shitikov.task13.NotNumberException;
import com.shitikov.task13.StringUtils;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Utils {
    Logger logger = LogManager.getLogger();

    public boolean isAllPositiveNumbers(String... str) {
        StringUtils utils = new StringUtils();
        int count = 0;

        try {
            while (count < str.length && utils.isPositiveNumber(str[count])) {
                count++;
            }
            return count == str.length;
        } catch (NotNumberException e) {
            logger.log(Level.WARN, "{} isn't a Number!", str[count]);
            return false;
        }
    }
}
