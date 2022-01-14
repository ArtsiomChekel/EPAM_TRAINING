package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("Введите число е: ");
        double e = in.nextDouble();
        int n = 1;
        double sumOfElements = 0;
        while (e <= (1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n))))
        {
            sumOfElements += (1 / (Math.pow(2, n)) + 1 / (Math.pow(3, n)));
            n++;
        }
        System.out.println(sumOfElements);
    }
}
