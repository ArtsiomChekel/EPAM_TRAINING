package com.company;

public class Main {

    public static void print (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args)
    {

        int [] array = {1, 2, 4, 6, 3, 2, 7, 1, 8, 23};

        for (int i = 0; i < array.length; i++)
        {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }


        print(array);

    }
}
