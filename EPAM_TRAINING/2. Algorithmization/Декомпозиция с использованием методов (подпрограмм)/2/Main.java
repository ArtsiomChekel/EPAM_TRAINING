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
    public static int findMinLenght(int[] array1, int[] array2, int[] array3, int[] array4)
    {
        int a = array1.length;
        int b = array2.length;
        int c = array3.length;
        int d = array4.length;

        int minLength = Math.min(Math.min(a, b), Math.min(c, d));
        return minLength;
    }

    public static int findBiggerDevider (int[] arrayA, int[] arrayB, int[] arrayC, int[] arrayD)
    {
        int biggerDevider = 0;
        for(int i = findMinLenght(arrayA, arrayB, arrayC, arrayD) -1; i >= 0; i--)
        {
            if(
                    (arrayA[arrayA.length -1] % arrayA[i] == 0)
                    && (arrayB[arrayB.length -1] % arrayB[i] == 0)
                    && (arrayC[arrayC.length -1] % arrayC[i] == 0)
                    && (arrayD[arrayD.length -1] % arrayD[i] == 0)
                    && (arrayA[i] == arrayB[i]) == (arrayC[i] == arrayD[i])
            )
            {
                return biggerDevider = arrayB[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число а: ");
        int a = in.nextInt();
        System.out.print("Введите число b: ");
        int b = in.nextInt();
        System.out.print("Введите число c: ");
        int c = in.nextInt();
        System.out.print("Введите число d: ");
        int d = in.nextInt();

        int[] arrayA = new int[a];
        fillArray(arrayA);
        printArray(arrayA);
        int[] arrayB = new int[b];
        fillArray(arrayB);
        printArray(arrayB);
        int[] arrayC = new int[c];
        fillArray(arrayC);
        printArray(arrayC);
        int[] arrayD = new int[d];
        fillArray(arrayD);
        printArray(arrayD);
        System.out.println(findBiggerDevider(arrayA, arrayB, arrayC, arrayD));
    }
}
