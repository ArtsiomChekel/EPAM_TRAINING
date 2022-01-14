package com.company;

import java.util.Scanner;

public class Main {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void getSortedArray(int [] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0; j--)
            {
                if (tmp < array[j])
                {
                    array[j+1] = array[j];
                }
                else{
                    break;
                }
            }
           array[j + 1] = tmp;
        }
    }

    public static void getRandomArray (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static int getIndexOfValue(int[] array, int value, int low, int high)
    {
        int index = 0;
        while (true)
        {
           int mid = (low + high) / 2;
            if (array[mid] == value)
            {
                index = mid;
                break;
            }
            else if (array[mid] > value)
            {
               high = mid - 1;
            }
            else if (array[mid] < value)
            {
                low = mid + 1;
            }
        }
        return index;
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] array = new int[15];
        getRandomArray(array);

        printArray(array);
        System.out.println();

        getSortedArray(array);
        printArray(array);

        System.out.println();
        System.out.print("Введите число, чей индекс необходимо найти: ");
        int value = in.nextInt();

        System.out.println();
       // System.out.println(getIndexOfValue(array, value, , array[i - 1]));



    }
}