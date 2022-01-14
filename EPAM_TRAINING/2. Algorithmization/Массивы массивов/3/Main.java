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
        System.out.println();
    }

    public static void printColumm(int [][] array, int index)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i][index]);
        }
        System.out.println();
    }

    public static void printString(int [][] array, int index)
    {
        for (int i = 0; i < array[0].length; i++)
        {
            System.out.print(array[index][i] + " ");
        }
        System.out.println();
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

        System.out.print("Введите номер k-ой строки для вывода: ");
        int k = in.nextInt() - 1;
        System.out.println();
        printString(array, k);
        System.out.println();
        System.out.print("Введите нмоер p-го столбца для вывода: ");
        int p = in.nextInt() -1;
        System.out.println();
        printColumm(array, p);
    }
}

