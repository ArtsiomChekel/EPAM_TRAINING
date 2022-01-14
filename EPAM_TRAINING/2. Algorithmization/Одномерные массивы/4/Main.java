package com.company;
import java.util.Scanner;

public class Main {

    public static void fillArrayWithRandom(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 20);
        }
    }

    public static int findMaxValue(int[] array)
    {
        int maxValue = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(maxValue < array[i])
            {
                maxValue = array[i];
            }
        }
        return maxValue;
    }
    public static int findMinValue(int[] array)
    {
        int minValue = array[0];
        for(int i = 1; i < array.length; i++)
        {
            if(minValue > array[i])
            {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static int findIndexOfValue (int [] array, int value)
    {
        int index = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == value)
            {
               index = i;
            }
        }
        return index;
    }

    public static void swapMaxMinValues(int[] array, int firstIndex, int secondIndex)
    {
        int helpValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = helpValue;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива N: ");
        int n = in.nextInt();

        int [] array = new int[n];
        fillArrayWithRandom(array);
        printArray(array);
        System.out.println();

        int maxValue = findMaxValue(array);
        int minValue = findMinValue(array);

        System.out.println("Max = " + maxValue);
        System.out.println("Min = " + minValue);

        int indexOfMaxValue = findIndexOfValue(array, maxValue);
        int indexOfMinValue = findIndexOfValue(array, minValue);

        swapMaxMinValues(array, indexOfMaxValue, indexOfMinValue);
        printArray(array);
    }
}