package com.company;
import java.util.Scanner;

public class Main {

    public static int getAmountOfNumber (int value)
    {
        String str = Integer.toString(value);
        int amountOfNumber = str.length();
        return amountOfNumber;
    }

    public static boolean chekIfNumbersGrowe(int value)
    {

        String str = Integer.toString(value);
        String strArray[] = str.split("");
        int[] numArray = new int[str.length()];
        for(int i = 0; i < numArray.length; i++)
        {
            numArray[i] = Integer.parseInt(strArray[i]);
        }
        boolean ifNumbersGrowe = true;
        for(int i = 0; i < numArray.length -1; i++)
        {
           if((numArray[i] >= numArray[i+1]))
           {
               ifNumbersGrowe = false;
           }
        }
        return ifNumbersGrowe;
    }

    public static void findValuesWithGrowingNumbers(int n)
    {
        for(int i =0 + (int) Math.pow(10, n-1); i < Math.pow(10, n); i++)
        {
            if(chekIfNumbersGrowe(i) == true)
            {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
        System.out.print("Введите количество цифр в числах n: ");
        int n = in.nextInt();
        findValuesWithGrowingNumbers(n);

    }
}
