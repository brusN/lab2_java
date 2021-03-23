package com.lab2.calculator;

import java.util.HashMap;
import java.util.Locale;

public interface CalculatorCommandSyntaxChecker {
    static boolean isVariableNameCorrect(String variableName) {
        return variableName.matches("^[a-zA-z].*");
    }

    static boolean isDouble(String arg) {
        return arg.matches("[+-]?([0-9]*[.,])?[0-9]+");
    }

    static boolean isCommandFound(String[] lineParts, HashMap<String, String> commands) {
        return commands.containsKey(lineParts[0].toUpperCase());
    }
}
