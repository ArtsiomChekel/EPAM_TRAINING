package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату х для первой точки: ");
         int x1 = in.nextInt();
        System.out.print("Введите координату y для первой точки: ");
        int y1 = in.nextInt();
        System.out.print("Введите координату х для второй точки: ");
        int x2 = in.nextInt();
        System.out.print("Введите координату y для второй точки: ");
    int y2 = in.nextInt();
        System.out.print("Введите координату х для третей точки: ");
    int x3 = in.nextInt();
        System.out.print("Введите координату y для третей точки: ");
    int y3= in.nextInt();
        if ((x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1))
        {
            System.out.println("Точки находятся на одной прямой");
        }
        else {
            System.out.println("Точки не находятся на одной прямой");
        }
    }
}
