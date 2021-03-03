package com.lab2.calculator.commands;

public class PlusCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Plus command!");
    }
}
