package com.lab2.calculator;

import java.util.HashMap;

interface CalculatorSyntaxChecker {
    static boolean isCommandFound(String[] lineParts, HashMap<String, String> commands) {
        return commands.containsKey(lineParts[0]);
    }
}
