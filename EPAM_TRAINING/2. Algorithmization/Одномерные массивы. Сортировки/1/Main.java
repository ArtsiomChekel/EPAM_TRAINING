package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Веедите число к: ");
        int k = in.nextInt();

        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(1, 2, 6, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(9, 5, 0, 7));

        arr1.addAll(k, arr2);
        System.out.println(arr1);

    }
}
