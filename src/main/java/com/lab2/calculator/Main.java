package com.lab2.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        Logger logger = LogManager.getLogger();
        FileInputStream fabricaConfigStream = new FileInputStream(args[0]);
        FileInputStream calculatorCommandsStream = new FileInputStream(args[1]);

        logger.info("I start parsing the configuration CSV file");
        HashMap<String, String> map = FabricCalculatorConfigParser.getCalculatorCommandConfig(fabricaConfigStream);
        // FabricCalculatorConfigParser.printCalculatorCommandConfig(map);

        logger.info("I start executing the parsed commands");
        CalculatorCommandExecutor.execute(calculatorCommandsStream, map);
    }
}
