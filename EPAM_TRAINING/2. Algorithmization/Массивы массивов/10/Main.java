package com.company;
import java.util.Scanner;

public class Main {

    public static void  fillArrayWithRandom(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                array[i][j] = (int) (Math.random() * 50);
            }
        }
    }

    public static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                System.out.printf("%3d\t", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }  public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
                System.out.printf("%3d\t", array[i]);
        }
        System.out.println();
    }

    public static int[]findSumOfValuesInCollums (int[][] array)
    {
        int [] sumOfValuesInCollums = new int[array[0].length];
        int sum = 0;
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                sum += array[j][i];
            }
            sumOfValuesInCollums[i] = sum;
            sum = 0;
        }
        return sumOfValuesInCollums;
    }

    public static void findMaxSum (int[] array)
    {
        int index =0;
        int maxSum = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if(maxSum < array[i])
            {
                maxSum = array[i];
                index = i;
            }
        }
        index++;
        System.out.println("Максимальная сумма в " + index + " столбце: " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы: ");
        int n = in.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int m = in.nextInt();

        int[][] array = new int[n][m];
        fillArrayWithRandom(array);
        printArray(array);

        System.out.println("Сумма чисел в каждом столбце: ");
        int[] arrayOfSummInCollums = findSumOfValuesInCollums(array);
        printArray(arrayOfSummInCollums);
        findMaxSum(arrayOfSummInCollums);
    }
}

