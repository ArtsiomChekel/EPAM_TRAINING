package com.company;

public class Main {

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void sortArrayDescending(int[] array)
    {
       int tmp = 0;
       int indexOfMaxValue = 0;
        for (int i = 0; i < array.length/2; i++)
        {
            int maxValue = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] > maxValue) {
                    maxValue = array[j];
                    indexOfMaxValue = j;
                }
            }
            tmp = array[i];
            array[i] = array[indexOfMaxValue];
            array[indexOfMaxValue] = tmp;
        }
    }

    public static void main(String[] args) {
    int [] array = {1, 4, 6, 8, 9, 12, 15, 17, 19, 22, 23, 30};
    printArray(array);
    sortArrayDescending(array);
    printArray(array);
    }
}
