package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координату х: ");
	    int x = in.nextInt();
        System.out.print("Введите координату y: ");
        int y = in.nextInt();
        if ((x <= 4 && x >= -4) && (y <= 4 && y >= -3)) {
            System.out.println("True");}
        else {
            System.out.println("False");}
    }
}
