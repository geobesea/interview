package com.exercises.interview.exceptions;

public class Calculator {

    public int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Result: " + calculator.divide(5, 0));
    }
}

