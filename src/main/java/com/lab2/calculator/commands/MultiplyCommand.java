package com.lab2.calculator.commands;

public class MultiplyCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Multiply command!");
    }

}
