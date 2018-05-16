package net.smallyu.corejava.ct;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Logger logger = LogManager.getLogger();
        logger.info(new Calculator().add(1, 1));
    }
}
