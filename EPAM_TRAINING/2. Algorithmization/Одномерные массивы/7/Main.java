package com.company;
import java.util.Scanner;

public class Main {

    public static void fillArrayWithRandom(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (Math.random() * 20);
        }
    }

    public static void printArray(double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("%.2f ",array[i]);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива N: ");
        int n = in.nextInt();

        double [] array = new double[n];
        fillArrayWithRandom(array);
        printArray(array);
        System.out.println();

        double max = array[0] + array[array.length - 1];

        for (int i = 0; i < array.length / 2; i++)
        {
            if (max <  array[i] + array[array.length -i - 1])
            {
                max = array[i] + array[array.length -i - 1];
            }
        }
        System.out.printf("%.2f ",max);

    }
}