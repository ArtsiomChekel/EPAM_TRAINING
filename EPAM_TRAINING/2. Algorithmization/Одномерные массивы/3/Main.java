package com.company;
import java.util.Scanner;

public class Main {

    public static void fillArrayWithRandom(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (10 - Math.random() * 20);
        }
    }


    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }
    public static int findPositiveValues(int[] array)
    {
        int numberOfPositiv = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] > 0)
            {
                numberOfPositiv++;
            }
        }
        return numberOfPositiv;
    }

    public static int findPNegativeValues(int[] array)
    {
        int numberOfNegative = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] < 0)
            {
                numberOfNegative++;
            }
        }
        return numberOfNegative;
    }

    public static int findOnesValues(int[] array)
    {
        int numberOfOnes = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 0)
            {
                numberOfOnes++;
            }
        }
        return numberOfOnes;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива N: ");
        int n = in.nextInt();

        int [] array = new int[n];
        fillArrayWithRandom(array);
        printArray(array);

        System.out.println("В массиве находится " + findPNegativeValues(array) + " отрицательных, "+ findPositiveValues(array)
        + " положительных и " + findOnesValues(array) + " нулевых элементов.");
    }
}


