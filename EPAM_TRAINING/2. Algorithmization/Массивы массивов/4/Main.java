package com.company;

import java.util.Scanner;

public class Main {

    public static void printArray(int [][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите порядок квадратной матрицы n (четное): ");
        int n = in.nextInt();
        if (n % 2 != 0)
        {
            System.out.println("Введенное вами число не является четным!");
        }
        else
        {
            int [][] array = new int [n][n];

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (i % 2 == 0) {
                        array[i][j] = j + 1;
                    } else {
                        array[i][j] = n - j;
                    }
                }
            }
            printArray(array);

        }
    }
}
