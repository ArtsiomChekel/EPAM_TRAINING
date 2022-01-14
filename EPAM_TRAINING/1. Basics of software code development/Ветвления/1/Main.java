package com.company;

public class Main {

    public static void main(String[] args) {
	int angle1 = 43;
    int angle2 = 67;
    if ((angle1 + angle2) < 180) {
        System.out.println("Треугольник существует!");}
    else {
        System.out.println("Треугольник не существует");}
        if (angle1 == 90 || angle2 == 90 || (angle1 + angle2 == 90))
        {
            System.out.println("Треугольник прямоугольный!");
        }
        else{System.out.println("Треугольник не прямоугольный!");}
    }
}

