package com.company;

public class Main {

    public static void main(String[] args) {
	int a = 2;
    int b = 5;
    int c = 6;

    double z = (b + (Math.pow(Math.pow(b*b, 2) + 4 * a * c, 0.5)))/ (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);

        System.out.println(z);
    }
}
