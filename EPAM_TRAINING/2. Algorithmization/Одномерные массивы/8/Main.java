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

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static int findMinIndex (int[] array)
    {
        int min = array[0];
        int index =0;
        for (int i = 0; i < array.length; i++)
        {
            if (min > array[i])
            {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int[] makeNewArray(int[] array, int index)
    {
        int[] newArray = new int[array.length - 1];
        for (int i = 0; i < index; i++)
        {
            newArray[i] = array[i];
        }

        for (int i = index; i < newArray.length; i++)
        {
            newArray[i] = array[i + 1];
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива N: ");
        int n = in.nextInt();

        int [] array = new int[n];
        fillArrayWithRandom(array);
        printArray(array);
        System.out.println();

        System.out.println(array[findMinIndex(array)]);
        array= makeNewArray(array, findMinIndex(array));
        printArray(array);

    }
}