package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        System.out.print("Введите значение х: ");
        int x = in.nextInt();
        double fX;
        if(x > 3)
        {
            fX = 1 / (Math.pow(x, 3) + 6);
        }
        else{
            fX= Math.pow(x, 2) - 3 * x + 9;
        }
        System.out.println(fX);
    }
}
