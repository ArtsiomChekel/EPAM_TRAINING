package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число отрезка а: ");
        double a = in.nextInt();
        System.out.print("Введите первое число отрезка b: ");
        double b = in.nextInt();
        System.out.print("Введите величину шага: ");
        double h = in.nextDouble();
        for(double i = a; i < b; i += h)
        {
            if (i > 2)
            {
                System.out.print(i + " ");
            }
            else
            {
                if (i == 0)
                {
                    System.out.print(i + " ");
                }
                else {
                System.out.print(-i + " ");
            }
            }
        }
    }
}
