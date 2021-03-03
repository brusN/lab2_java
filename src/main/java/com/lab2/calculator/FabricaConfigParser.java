package com.lab2.calculator;

import java.io.*;
import java.util.HashMap;

interface FabricaConfigParser {
    static HashMap<String, String> getCalculatorCommandConfig(FileInputStream configFile) {
        HashMap<String, String> calculatorCommandConfig = new HashMap<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(configFile))) {
            String fileLine = fileReader.readLine();
            while (fileLine != null) {
                // First part is syntax calculator command
                // Second part is name calculator command implementation class
                if (fileLine.isEmpty())
                    continue;
                String[] lineParts = fileLine.split(" ");
                if (calculatorCommandConfig.containsKey(lineParts[0])) {
                    throw new Exception("multiple definitions of command name");
                }
                calculatorCommandConfig.put(lineParts[0], lineParts[1]);
                fileLine = fileReader.readLine();
            }
        } catch (Exception exception) {
            System.err.println("Error while reading fabrica config file: " + exception.getLocalizedMessage());
        }
        return calculatorCommandConfig;
    }
}
