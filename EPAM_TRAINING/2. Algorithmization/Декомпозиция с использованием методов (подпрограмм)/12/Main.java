package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int getSummOfNumbers(int value)
    {
        String str = Integer.toString(value);
        String strArray[] = str.split("");
        int[] numArray = new int[str.length()];
        for(int i = 0; i < numArray.length; i++)
        {
            numArray[i] = Integer.parseInt(strArray[i]);
        }
        int summOfNumbers = Arrays.stream(numArray).sum();
        return summOfNumbers;
    }

    public static void makeArrayA(ArrayList<Integer> arrayA, int k, int n)
    {
        int i = 0;
        while(i < n)
        {
            if(getSummOfNumbers(i) == k)
            {
                arrayA.add(i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число К: ");
        int k = in.nextInt();
        System.out.print("Введите число N: ");
        int n = in.nextInt();

        ArrayList<Integer> array = new ArrayList<>();
        makeArrayA(array, k, n);

        System.out.println(array);
    }
}
