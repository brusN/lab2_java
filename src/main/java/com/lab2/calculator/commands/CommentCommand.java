package com.lab2.calculator.commands;

public class CommentCommand implements CalculatorCommand {

    @Override
    public void doWork(String[] args) {
        System.out.println("Comment command!");
    }
}