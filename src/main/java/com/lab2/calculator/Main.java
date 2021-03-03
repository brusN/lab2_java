package com.lab2.calculator;

import com.lab2.calculator.commands.CalculatorCommand;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fabricaConfigStream = new FileInputStream(args[0]);
        FileInputStream calculatorCommandsStream = new FileInputStream(args[1]);
        HashMap<String, String> map = FabricaConfigParser.getCalculatorCommandConfig(fabricaConfigStream);
        for (HashMap.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Синтаксис комманды: '" + entry.getKey() + "', имя класса: '" + entry.getValue() + "'");
        }
        LinkedList<CalculatorCommand> commandQueue = CalculatorOperationsParser.getCommandList(calculatorCommandsStream, map);
        for (CalculatorCommand nextOperation : commandQueue) {
            nextOperation.doWork(null);
        }
    }
}
