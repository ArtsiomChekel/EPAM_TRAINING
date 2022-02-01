package com.company;
import java.util.Scanner;

public class Main {

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void fillArray(int[] array)
    {
        for(int i = 1; i <= array.length; i++)
        {
            array[i - 1] = i;
        }
    }
    public static int findMinLenght(int[] array1, int[] array2)
    {
        int a = array1.length;
        int b = array2.length;
        int minLength = Math.min(a, b);
        return minLength;
    }

    public static int findBiggerDevider (int[] arrayA, int[] arrayB)
    {
        int biggerDevider = 0;
        for(int i = findMinLenght(arrayA, arrayB) -1; i >= 0; i--)
        {
                if((arrayA[arrayA.length -1] % arrayA[i] == 0) && (arrayB[arrayB.length -1] % arrayB[i] == 0) && (arrayA[i] == arrayB[i]))
                {
                    return biggerDevider = arrayB[i];
                }
        }
        return -1;
    }

    public static int findSmallerMultiply(int a, int b, int biggerDevider)
    {
        int smallerMultiply = a * b / biggerDevider;

        return smallerMultiply;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();

        int[] arrayA = new int[a];
        fillArray(arrayA);
        printArray(arrayA);
        int[] arrayB = new int[b];
        fillArray(arrayB);
        printArray(arrayB);

        int biggerDevider = findBiggerDevider(arrayA, arrayB);
        System.out.println(biggerDevider);
        System.out.println(findSmallerMultiply(a, b, findBiggerDevider(arrayA, arrayB)));

    }
}
