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
    public static void sortColummsInArrayUp(int[][] array)
    {
        for (int k = 0; k < array[0].length; k++){
            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array.length; j++) {
                    int minValue = array[i][k];
                    if (array[j][k] > minValue)
                    {
                        int changeValue = array[i][k];
                        minValue = array[j][k];
                        array[i][k] =minValue;
                        array[j][k] =changeValue;
                    }
                }
            }
        }
    }
    public static void sortColummsInArrayDown(int[][] array)
    {
        for (int k = 0; k < array[0].length; k++){
            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array.length; j++) {
                    int maxValue = array[i][k];
                    if (array[j][k] < maxValue)
                    {
                        int changeValue = array[i][k];
                        maxValue = array[j][k];
                        array[i][k] =maxValue;
                        array[j][k] =changeValue;
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
            sortColummsInArrayUp(array);
            printArray(array);
        }
        else if (typeOfSort == 2)
        {
            sortColummsInArrayDown(array);
            printArray(array);
        }
        else
        {
            System.out.println("Ошибка ввода, попробуйте снова");
        }
    }
}
