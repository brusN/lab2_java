package com.lab2.calculator.commands;

public class PopCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Pop command!");
    }
}
