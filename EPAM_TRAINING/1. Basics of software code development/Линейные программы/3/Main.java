package com.company;

public class Main {

    public static void main(String[] args) {
	int x = 5;
    int y = 7;
    double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
        System.out.println(z);
    }
}
