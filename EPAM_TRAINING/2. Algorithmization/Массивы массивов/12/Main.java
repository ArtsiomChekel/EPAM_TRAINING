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
    public static void sortStringsInArrayUp(int[][] array)
    {
        for (int k = 0; k < array.length; k++){
            for (int i = 0; i < array[0].length; i++)
            {
                for (int j = 0; j < array[0].length; j++) {
                    int minValue = array[k][i];
                    if (array[k][j] > minValue)
                    {
                        int changeValue = array[k][i];
                        minValue = array[k][j];
                        array[k][i] =minValue;
                        array[k][j] =changeValue;
                    }
                }
            }
        }
    }
    public static void sortStringsInArrayDown(int[][] array)
    {
        for (int k = 0; k < array.length; k++){
            for (int i = 0; i < array[0].length; i++)
            {
                for (int j = 0; j < array[0].length; j++) {
                    int maxValue = array[k][i];
                    if (array[k][j] < maxValue)
                    {
                        int changeValue = array[k][i];
                        maxValue = array[k][j];
                        array[k][i] =maxValue;
                        array[k][j] =changeValue;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int [][] array = new int [5][4];
        fillArrayWithRandom(array);
        printArray(array);
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.println("Для сортировки по возрастанию введите 1; по убыванию 2");
        int typeOfSort = in.nextInt();
        if (typeOfSort == 1) {
            sortStringsInArrayUp(array);
            printArray(array);
        }
        else if (typeOfSort == 2)
        {
            sortStringsInArrayDown(array);
            printArray(array);
        }
        else
        {
            System.out.println("Ошибка ввода, попробуйте снова");
        }
    }
}
