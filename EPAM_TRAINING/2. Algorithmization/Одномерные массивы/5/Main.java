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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива N: ");
        int n = in.nextInt();

        int [] array = new int[n];
        fillArrayWithRandom(array);
        printArray(array);
        System.out.println();

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > i)
            {
                System.out.print(array[i] + " ");
            }
        }
    }
}
