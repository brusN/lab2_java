package com.lab2.calculator;


import com.lab2.calculator.commands.CalculatorCommand;

import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.LinkedList;

interface CalculatorOperationsParser {
    static LinkedList<CalculatorCommand> getCommandList(FileInputStream inputStream, HashMap<String, String> commands) {
        LinkedList<CalculatorCommand> commandList = new LinkedList<>();
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(inputStream))) {
            String line = fileReader.readLine();
            while (line != null) {
                String[] splitedLine = line.split(" ");
                if (CalculatorSyntaxChecker.isCommandFound(splitedLine, commands)) {
                    commandList.addLast(CalculatorCommandFabrica.createNewMathOperation(commands.get(splitedLine[0])));
                } else {
                    throw new Exception("command hasn't recognized");
                }
                line = fileReader.readLine();
            }
        } catch (Exception ex) {
            System.err.println("Error while calculating: " + ex.getLocalizedMessage());
        }
        return commandList;
    }
}
