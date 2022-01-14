package com.company;

public class Main {

    public static int findMax(int firstValue, int secondValue)
    {
        int max;
        if (firstValue > secondValue)
        {
         max = firstValue;
        }
            else{ max = secondValue;}
        return max;
    }

    public static int findMin(int firstValue, int secondValue)
    {
        int min;
        if (firstValue > secondValue)
        {
            min = secondValue;
        }
        else {min = firstValue;}
        return min;
    }

    public static void main(String[] args) {
	int a = 6;
    int b = 9;
    int c = 2;
    int d = 5;
    int max = findMax(findMin(a, b), findMin(c, d));
        System.out.println(max);
    }
}
