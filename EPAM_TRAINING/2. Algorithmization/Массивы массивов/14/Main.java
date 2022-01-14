package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void randomOnes (int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            int amountOfOnes = 0;
            while (amountOfOnes != i + 1){
                int j = ((int) (Math.random() * array.length));
                if (array[j][i] != 1)
                {array[j][i] = 1; amountOfOnes++;}
            }
        }
    }

    public static void main(String[] args) {



        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы m: ");
        int m = in.nextInt();
        int [][] array = new int [m][m];
        randomOnes(array);
        printArray(array);
        System.out.println();
        }
    }

