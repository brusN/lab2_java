package com.lab2.calculator.commands;

public class SqrtCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Sqrt command!");
    }
}
