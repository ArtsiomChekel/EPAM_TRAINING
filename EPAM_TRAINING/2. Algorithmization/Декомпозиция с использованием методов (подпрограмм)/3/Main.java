package com.company;

public class Main {

    public static double findSquereOfTriangle(int a)
    {
        double squereOfTriangle = 3 * Math.pow(3, 0.5) / 2 * Math.pow(a, 2);
        return squereOfTriangle;
    }

    public static double findSquereOfHexagon(int a)
    {
        double squereOfTriangle = findSquereOfTriangle(a);
        double squereOfHexagon = 6 * squereOfTriangle;
        return squereOfHexagon;
    }

    public static void main(String[] args) {
        int a = 10;
        System.out.println(findSquereOfHexagon(a));
    }
}
