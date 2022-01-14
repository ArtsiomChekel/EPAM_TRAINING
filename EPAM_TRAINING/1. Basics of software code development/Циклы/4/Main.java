package com.company;

public class Main {

    public static void main(String[] args) {
        int multiplicationOfNumbers = 1;
        for (int i = 1; i <= 200; i++)
        {
            multiplicationOfNumbers *= Math.pow(i, 2);
        }
        System.out.println(multiplicationOfNumbers);
    }
    }

