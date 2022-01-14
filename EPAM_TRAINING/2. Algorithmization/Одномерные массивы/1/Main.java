package com.company;
import java.util.Scanner;

public class Main {

    public static void fillArrayWithRandom(int[] array)
    {
        for(int i =0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 10);
        }
    }

    public static int findSumm(int [] array, int k)
    {
        int summ=0;
        for (int i = 0; i < array.length; i++)
        {
            if ((array[i] % k) == 0)
            {
                summ+= array[i];
            }
        }
        return summ;
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
        System.out.print("Введите число K: ");
        int k = in.nextInt();

        int [] array = new int[n];
        fillArrayWithRandom(array);
        printArray(array);
        System.out.println();
        System.out.println(findSumm(array,k));
    }
}
