package com.company;
import java.util.Scanner;


public class Main {

    public static void printArray(int[][] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            for(int j = 0; j < array[0].length; j ++)
            {
                System.out.print(array[i][j] + "\t");
            }
            System.out.print("\n");
        }
        System.out.println();
    }

    public static void fillArrayOfCoordinates (int[][] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[0].length; j++)
            {
                array[i][j] = (int) (Math.random() * 15);
            }
        }
    }

    public static int findDistance (int aX, int aY, int bX, int bY)
    {
        int distance = (int) Math.pow(Math.pow(bX - aX, 2) + Math.pow(bY - aY, 2), 0.5);
        return distance;
    }

    public static int[] findDotsWithsMaximalDistance (int [][]array)
    {
        int[] indexOfDots = new int[2];
        int maximalDistance = findDistance(array[0][0],array[0][1], array[1][0], array[1][1]);
        for (int i = 0; i < array[0].length-1; i++)
        {
            for (int j = i + 1; j < array[0].length-1; j++)
            {
                if(maximalDistance <= findDistance(array[0][i],array[1][i], array[0][j], array[1][j]))
                {
                    maximalDistance = findDistance(array[0][i],array[1][i], array[0][j], array[1][j]);
                    indexOfDots[0] = i;
                    indexOfDots[1] = j;
                }
            }
        }

        return indexOfDots;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество точек n: ");
        int n = in.nextInt();

    	int[][] arrayOfCoordinates = new int[2][n];
        fillArrayOfCoordinates(arrayOfCoordinates);
        printArray(arrayOfCoordinates);
        int[] indexOfMaimalDistance = findDotsWithsMaximalDistance(arrayOfCoordinates);
        System.out.printf("Максимальное расстояние между точкой под номером %d и точкой под номером %d", indexOfMaimalDistance[0] + 1, indexOfMaimalDistance[1] + 1);
    }
}
