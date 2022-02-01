package com.company;

public class Main {

    public static void fillArray(int[] array)
    {
        for(int i = 1; i <= array.length; i++)
        {
            array[i - 1] = i;
        }
    }
    public static int findMinLenght(int[] arrayA, int[] arrayB, int[] arrayC)
    {
        int a = arrayA.length;
        int b = arrayB.length;
        int c = arrayC.length;

        int minLength = Math.min(a, Math.min(b, c));
        return minLength;
    }

    public static int findBiggerDevider (int[] arrayA, int[] arrayB, int[] arrayC)
    {
        int biggerDevider = 0;
        for(int i = findMinLenght(arrayA, arrayB, arrayC) -1; i >= 0; i--)
        {
            if((arrayA[arrayA.length -1] % arrayA[i] == 0)
                    && (arrayB[arrayB.length -1] % arrayB[i] == 0)
                    && (arrayC[arrayC.length -1] % arrayC[i] == 0)
                    && ((arrayA[i] == arrayB[i]) == (arrayB[i] == arrayC[i]))
            )
            {
                return biggerDevider = arrayB[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
	    int valueA = (int) (Math.random() * 14 + 1);
        int[] arrayA = new int[valueA];
        fillArray(arrayA);
        System.out.println(valueA);

        int valueB = (int) (Math.random() * 14 + 1);
        int[] arrayB = new int[valueB];
        fillArray(arrayB);
        System.out.println(valueB);

        int valueC = (int) (Math.random() * 14 + 1);
        int[] arrayC = new int[valueC];
        fillArray(arrayC);
        System.out.println(valueC);

        int biggerDevider = findBiggerDevider(arrayA, arrayB, arrayC);
        if(biggerDevider == 1)
        {
            System.out.printf("Числа %d, %d, %d являются взаимно простыми", valueA, valueB, valueC);
        }
        else{
            System.out.printf("Числа %d, %d, %d не являются взаимно простыми", valueA, valueB, valueC);
        }

    }
}
