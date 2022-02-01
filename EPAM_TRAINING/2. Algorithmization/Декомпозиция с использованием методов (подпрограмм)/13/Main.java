package com.company;
import java.util.Scanner;

public class Main {

    public static boolean checkIfIsSimple (int n)
    {
        boolean isSimple = true;

        for(int i = 2; i <= n/2; i++)
        {
            if(n % i == 0)
            {
                isSimple = false;
            }
        }
        return isSimple;
    }

    public static void findTwins(int n)
    {
        for(int i = n; i <= 2*n; i ++)
        {
            if(checkIfIsSimple(i -2) == true && checkIfIsSimple(i) == true)
            {
                System.out.printf("Число %d и число %d являются близнецами\n", i-2, i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = in.nextInt();
        System.out.println(checkIfIsSimple(n));
        findTwins(n);

    }
}