package com.company;

public class Main {

    public static void main(String[] args) {
	double r = 135.789;
        System.out.println(r);
    int wholePart = (int) r;
        int fractionalPart = (int) (r * 1000) % 1000;
    double newR = fractionalPart + (double) wholePart / 1000;
        System.out.println(newR);
    }
}
