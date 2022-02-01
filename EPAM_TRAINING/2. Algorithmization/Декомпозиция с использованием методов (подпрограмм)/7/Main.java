package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static int factorialOfValue(int value)
    {
        int factorial = 1;
        for (int i = 1; i <= value; i++)
        {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int summOfFactorial = 0;
        for(int i = 1; i <= 9; i++)
        {
            if(i % 2 !=0)
            {
               summOfFactorial += factorialOfValue(i);
               System.out.printf("Факториал числа %d, равен %d \n", i, factorialOfValue(i));
            }
        }
        System.out.printf("Сумма факториалов нечетных чисел от 1 до 9 равна: %d", summOfFactorial);
    }
}
