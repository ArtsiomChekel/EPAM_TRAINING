package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int number = in.nextInt();
        for (int i = 1; i <= number; i++)
        {
            System.out.print(i + " ");
        }
    }
}
