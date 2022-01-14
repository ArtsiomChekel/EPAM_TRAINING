package com.company;
import java.util.Arrays;

public class Main {

    public static void getRandomArray (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println();
    }

    public static void printFractions(int[] numerator, int[] denumerator) {
        for (int i = 0; i < numerator.length; i++) {
            System.out.printf("%d/%d ",numerator[i], denumerator[i]);
        }
        System.out.println();
    }

    public static void sortArray(int[] array) {
        int tmp = 0;
        int i = 0;
        while (true) {
            if (array[0] > array[1]){
                tmp = array[0];
                array[0] = array[1];
                array[1] = tmp;
            }
            if (array[i] > array[i + 1]) {
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                i --;
            }
            else{
                i++;
            }
            if (i > array.length - 2)
            {
                break;
            }
        }
    }
    public static int findMaxElement (int[] array)
    {
        int maxElement = array[0];
        for(int i = 0; i < array.length; i++)
        {
            if (maxElement < array[i])
            {
                maxElement = array[i];
            }
        }
        return maxElement;
    }

    public static int findEqualDenumerator (int[] denumerator)
    {
        for(int i = 1; i < 1100000000; i++) {
            int countOfMistakes = 0;
            int generalDenumerator = findMaxElement(denumerator) * i;
            for (int j = 0; j < denumerator.length; j++) {
                if (generalDenumerator % denumerator[j] != 0) {
                    countOfMistakes++;
                }
            }
            if (countOfMistakes == 0) {
                return generalDenumerator;
            }
        }
        return -1;
    }

    public static void setGeneralDenumerator (int[] numerator, int[] denumerator)
    {
        int generalDenumerator = findEqualDenumerator(denumerator);
        for (int i = 0; i < numerator.length; i++)
        {
            numerator[i] *= generalDenumerator / denumerator[i];
            denumerator[i] = generalDenumerator;
        }
    }

    public static void main(String[] args) {
        int[] numerator = new int[10];
        getRandomArray(numerator);
        int[] denominator = new int[10];
        getRandomArray(denominator);
        printFractions(numerator, denominator);
        int generalDenumerator = findEqualDenumerator(denominator);
        System.out.println(generalDenumerator);
        setGeneralDenumerator(numerator, denominator);
        System.out.println();
        sortArray(numerator);
        printFractions(numerator, denominator);

    }
}
