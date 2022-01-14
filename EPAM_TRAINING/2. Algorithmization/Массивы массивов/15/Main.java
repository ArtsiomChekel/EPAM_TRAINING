package com.company;
import java.util.Scanner;

public class Main {

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void fillArrayWithRandom(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 100);
            }
        }
    }
    public static int findMaxValue(int [][] array)
    {
        int maxValue = array[0][0];
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                if (maxValue < array[i][j])
                {
                    maxValue = array[i][j];
                }
            }
        }
        return maxValue;
    }

    public static void changeElements(int [][] array, int maxValue)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                if ((array[i][j] % 2 != 0) && (array[i][j] == 0))
                {
                    array[i][j] = maxValue;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][] array = new int [5][4];
        fillArrayWithRandom(array);
        printArray(array);
        System.out.println();
        int maxValue = findMaxValue(array);
        System.out.println("Максимальный элемент матрицы: " + maxValue);
        changeElements(array, maxValue);
        printArray(array);
    }
}
