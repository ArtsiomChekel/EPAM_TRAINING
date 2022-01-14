package com.company;

public class Main {

    public static void main(String[] args) {
	int t = 6789;
    int hours = t / 3600;
    int minutes = (t - hours * 3600) / 60;
    int seconds = (t - hours * 3600) % 60;
        System.out.println(hours + " часов " + minutes + " минут " + seconds + " секунд.");
    }
}
