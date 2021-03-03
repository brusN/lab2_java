package com.lab2.calculator.commands;

public class PrintCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Print command!");
    }
}
