package com.company;
import java.util.Scanner;

public class Main {

    public static void fillArrayWithRandom(double[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = 10 - (Math.random() * 20);
        }
    }

    public static void printArray(double[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static boolean isSimple (int index)
    {
        if (index < 2) {
            return false;
        }
        int rest;
        for (int i = 2; i <= index / 2; i++)
        {
            rest = index % i;
            if (rest == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива N: ");
        int n = in.nextInt();

        double [] array = new double[n];
        fillArrayWithRandom(array);
        printArray(array);
        System.out.println();

        double sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (isSimple(i))
            {
                System.out.print(i + " простое число ");
                sum += array[i];
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}