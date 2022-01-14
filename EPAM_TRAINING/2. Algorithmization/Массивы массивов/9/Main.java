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

    public static void swapColumms(int[][] array, int index1, int index2)
    {
        for (int i = 0; i < array.length; i++)
        {
            int helpValue = array[i][index1];
            array[i][index1] = array[i][index2];
            array[i][index2] = helpValue;
        }
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

        System.out.print("Введите номер первого столбца, который нужно поменять со вторым: ");
        int index1 = in.nextInt() - 1;
        System.out.println();
        System.out.print("Введіте номер второго столбца, который нужно поменять с первым: ");
        int index2 = in.nextInt() - 1;
        System.out.println();

        swapColumms(array, index1, index2);
        printArray(array);
    }
}

