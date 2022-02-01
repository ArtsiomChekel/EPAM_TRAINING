package com.company;

public class Main {

    public static int findSquereOfTriangle(int z, int t, int q)
    {
        int semiPerimeter = (z + t + q) / 2;
        int squereOfTriangle = (int) Math.sqrt(semiPerimeter
                * (semiPerimeter - z)
                * (semiPerimeter - t) * (semiPerimeter-q));
        return squereOfTriangle;
    }

    public static int findSquere(int x, int y, int z, int t)
    {
        int q = (int) Math.sqrt(x*x + y*y); // Нахождение гипотенузы прямоугольного треугольника
        int squere = (x * y)/2 + findSquereOfTriangle(z, t, q);
        return squere;
    }

    public static void main(String[] args) {
	int x = 6;
    int y = 8;
    int z = 5;
    int t = 7;
    int squere = findSquere(x, y, z, t);
    System.out.println(squere);
    }
}
