package com.lab2.calculator.commands;

public class DivisionCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Division command!");
    }
}
