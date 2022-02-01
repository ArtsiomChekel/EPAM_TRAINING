package com.company;

import java.util.Scanner;

public class Main {

    public static int findSumOfElements (int value)
    {
        int sumOfElements = 0;

        String str = Integer.toString(value);
        String strArray[] = str.split("");
        int[] numArray = new int[str.length()];
        for(int i = 0; i < numArray.length; i++)
        {
            numArray[i] = Integer.parseInt(strArray[i]);
        }

        for(int i = 0; i < numArray.length; i++)
        {
            sumOfElements += numArray[i];
        }
        return sumOfElements;
    }

    public static int findAnountOfOperations(int value)
    {
        int amountOfOperations = 0;
        int tmpValue = value;
        while(tmpValue != 0)
        {
            tmpValue -= findSumOfElements(tmpValue);
            amountOfOperations++;
        }
        return amountOfOperations;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int value = in.nextInt();
        System.out.println(findAnountOfOperations(value));

    }
}
