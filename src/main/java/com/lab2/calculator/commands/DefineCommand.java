package com.lab2.calculator.commands;

public class DefineCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Define command!");
    }
}