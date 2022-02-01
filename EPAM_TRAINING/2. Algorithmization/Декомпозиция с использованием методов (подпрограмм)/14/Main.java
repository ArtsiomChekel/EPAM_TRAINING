package com.company;
import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static int getSummOfNumbers(int value)
    {
        String str = Integer.toString(value);
        String strArray[] = str.split("");
        int[] numArray = new int[str.length()];
        for(int i = 0; i < numArray.length; i++)
        {
            numArray[i] = (int)(Math.pow(Integer.parseInt(strArray[i]), getAmountOfNumber(value)));
        }
        int summOfNumbers = Arrays.stream(numArray).sum();
        return summOfNumbers;
    }

    public static int getAmountOfNumber (int value)
    {
        String str = Integer.toString(value);
        int amountOfNumber = str.length();
        return amountOfNumber;
    }

    public static void findArmstrongValues(int k)
    {
        for (int i = 1; i <= k; i++)
        {
            if(getSummOfNumbers(i) == i)
            {
                System.out.printf("Число %d является числом Армстронга\n", i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число К: ");
        int k = in.nextInt();
        findArmstrongValues(k);
    }
}
