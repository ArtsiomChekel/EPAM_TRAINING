package com.company;

public class Main {

    public static void main(String[] args) {
	int holeA = 10;
    int holeB = 4;

    int blockX = 3;
    int blockY = 5;
    int blockZ = 2;

    if ((holeA >= blockX && holeB >= blockY) || (holeA >= blockY && holeB >= blockX) || (holeA >= blockY && holeB >= blockZ)
    || (holeA >= blockZ && holeB >= blockY) || (holeA >= blockX && holeB >= blockZ) || (holeA >= blockZ && holeB >= blockX))
    {
        System.out.println("Кирпич пройдет");
    }
    else
    {
        System.out.println("Кирпич не пройдет");
    }
    }
}
