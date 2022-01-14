package com.company;

import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static int getIndex (int value, ArrayList <Integer> arr1)
    {
        int index = 0;

        if (value <= arr1.get(0))
        {
            return index;
        }
        if (value >= arr1.get(arr1.size() - 1))
        {
            index = arr1.size() ;
            return index;
        }
        for(int i = 0; i < arr1.size() - 2; i++)
        {
            if (value >= arr1.get(i) && value <= arr1.get(i+1))
            {
                index = i + 1;
            }

        }

        return index;
    }


    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 4, 6, 11, 12, 13, 16));
        int[] arr2 = {2, 5, 9, 18};

        for (int i = 0; i < arr2.length; i++)
        {
             arr1.add(getIndex(arr2[i], arr1), arr2[i]);
        }

        System.out.println(arr1);
    }
}
