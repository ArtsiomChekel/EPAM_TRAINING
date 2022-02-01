package com.company;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    public static boolean chekIfNumbersNotEven (int value)
    {
        String str = Integer.toString(value);
        String strArray[] = str.split("");
        int[] numArray = new int[str.length()];
        for(int i = 0; i < numArray.length; i++)
        {
            numArray[i] = Integer.parseInt(strArray[i]);
        }

        boolean isNotEven = true;
        for(int i = 0; i < numArray.length; i++)
        {
            if(numArray[i] % 2 == 0)
            {
                isNotEven = false;
            }
        }
        return isNotEven;
    }

    public static int findSummOfNotEvenNumbers(int n)
    {
        int summOfNotEvenNumbers = 0;
        for(int i =0 + (int) Math.pow(10, n-1); i < Math.pow(10, n); i++)
        {
            if(chekIfNumbersNotEven(i) == true)
            {
                summOfNotEvenNumbers += i;
            }
        }
        return summOfNotEvenNumbers;
    }

    public static void findEvenNumbersInValue(int value)
    {
        String str = Integer.toString(value);
        String strArray[] = str.split("");
        int[] numArray = new int[str.length()];
        for(int i = 0; i < numArray.length; i++)
        {
            numArray[i] = Integer.parseInt(strArray[i]);
        }

        for(int i = 0; i < numArray.length; i++)
        {
            if(numArray[i] % 2 == 0)
            {
                System.out.printf("Число %d является четным\n", numArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество цифр в числах n: ");
        int n = in.nextInt();
        int summ = findSummOfNotEvenNumbers(n);
        System.out.println(summ);
        findEvenNumbersInValue(summ);
    }
}
