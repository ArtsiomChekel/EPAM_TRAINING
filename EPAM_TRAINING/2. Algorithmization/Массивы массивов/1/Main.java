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

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество строк в массиве: ");
        int n = in.nextInt();
        System.out.print("Введите количество столбцов в массиве: ");
        int m = in.nextInt();

        int[][] array = new int[n][m];
        fillArrayWithRandom(array);

        printArray(array);
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if ((j % 2 == 0) && (array[0][j] > array[array.length - 1][j]))
                {
                    System.out.printf("%2d\t", array[i][j]);
                }
            }
            System.out.println();
        }

    }
}
