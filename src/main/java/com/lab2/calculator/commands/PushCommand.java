package com.lab2.calculator.commands;

public class PushCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Push command!");
    }
}
