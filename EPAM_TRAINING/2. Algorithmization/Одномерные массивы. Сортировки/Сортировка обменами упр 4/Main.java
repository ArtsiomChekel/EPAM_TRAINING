package com.company;

public class Main {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void sortArray (int[] array)
    {
        int helpValue = 0;
        while(true) {
            int countOfChanges = 0;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    helpValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = helpValue;
                    countOfChanges++;
                }
            }
            if (countOfChanges == 0)
            {break;}
        }
    }


    public static void main(String[] args) {

        int [] array = new int [16];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }
        printArray(array);
        System.out.println();
        sortArray(array);
        printArray(array);

    }
}
