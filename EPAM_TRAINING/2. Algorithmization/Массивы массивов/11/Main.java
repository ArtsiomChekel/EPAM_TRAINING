package com.company;
import java.util.Scanner;

public class Main {

    public static void  fillArrayWithRandom(int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                array[i][j] = (int) (Math.random() * 15);
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%3d\t", array[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }

    public static int[] findIndexOfColums (int[][] array)
    {
        int[] indexOfStrings = new int[array.length];
        for (int i = 0; i < array.length; i++)
        {
            int amountOfRepeats = 0;
            for (int j = 0; j < array[0].length; j++)
            {
                if (array[i][j] == 5)
                {
                    amountOfRepeats++;
                }
            }
            if(amountOfRepeats >= 3)
            {
                indexOfStrings[i] = 1;
            }
        }
        return indexOfStrings;
    }

    public static boolean chekIsArrayOfIndexFill (int [] array)
    {
        boolean chek = false;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] == 1)
            {
                chek = true;
            }
        }
        return chek;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int[][] array = new int[10][20];
        fillArrayWithRandom(array);
        printArray(array);

        int [] arrayOfIndex = findIndexOfColums(array);
        if (chekIsArrayOfIndexFill(arrayOfIndex)) {
            System.out.println("Число 5 повторяется три или более раза в строках под номерами: ");
            for (int i = 0; i < arrayOfIndex.length; i++) {
                if (arrayOfIndex[i] == 1) {
                    System.out.println(i + 1);
                }
            }
        }
        else
        {
            System.out.println("Число 5 встречается в строках реже чем три раза");
        }
    }
}


