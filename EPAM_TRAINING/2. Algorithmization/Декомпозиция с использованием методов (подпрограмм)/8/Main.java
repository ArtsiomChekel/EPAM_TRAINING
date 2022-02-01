package com.company;
import java.util.Scanner;

public class Main {
    
    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] +"\t");
        }
        System.out.println();
    }

    public static void fillArray(int[] array)
    {
        for (int i = 0; i< array.length; i++) {
            array[i] = (int) (Math.random() * 25);
        }
    }

    public static void findSumOfThree(int[]array, int k, int m)
    {
        for(int i = k -1; i < m -1; i += 3)
        {
            int summOfThree = 0;
            for(int j = i; j < i + 3; j++) {
                summOfThree += array[j];
            }
            System.out.printf("Сумма чисел под номерами от %d до %d равна: %d\n", i+1, i+3, summOfThree);
        }

    }

    public static void main(String[] args) {
	int[] array = new int[15];
    fillArray(array);
    printArray(array);

    Scanner in = new Scanner(System.in);
    System.out.print("Введите число К: ");
    int k = in.nextInt();
    System.out.print("Введите число M: ");
    int m= in.nextInt();
    findSumOfThree(array, k, m);
    }
}
