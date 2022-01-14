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
                System.out.printf("%2d\t", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void printDiagonal (int [][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (i == j) {
                    System.out.printf("%2d\t", array[i][j]);
                }
                else {
                    System.out.printf("    ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите порядок матрицы: ");
        int n = in.nextInt();

        int[][] array = new int[n][n];
        fillArrayWithRandom(array);

        printArray(array);

        System.out.println();
        printDiagonal(array);
    }
}
