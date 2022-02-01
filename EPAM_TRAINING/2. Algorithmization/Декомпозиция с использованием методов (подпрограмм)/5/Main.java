package com.company;
import java.util.Scanner;

public class Main {

    public static void fillArray (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 15);
        }
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }
    public static int findBigestValue(int[] array)
    {
        int bigestValue = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if(bigestValue < array[i])
            {
                bigestValue = array[i];
            }
        }
        return bigestValue;
    }

    public static int findSecondBigestValue (int[] array)
    {
        int secondBigestValue = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if((secondBigestValue < array[i]) && (array[i] != findBigestValue(array)))
            {
                secondBigestValue = array[i];
            }
        }
        return secondBigestValue;
    }

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в массиве N: ");
        int n = in.nextInt();

        int[] array = new int[n];
        fillArray(array);
        printArray(array);

        int secondBigestValue = findSecondBigestValue(array);
        System.out.println(secondBigestValue);

    }
}
