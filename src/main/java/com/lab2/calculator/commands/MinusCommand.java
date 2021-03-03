package com.lab2.calculator.commands;

public class MinusCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Minus command!");
    }


}
