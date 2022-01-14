package com.company;

public class Main {

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void getRandomArray (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public static void sortArray(int[] array) {
        int tmp = 0;
        int i = 0;
        while (true) {
            if (array[0] > array[1]){
                tmp = array[0];
                array[0] = array[1];
                array[1] = tmp;
            }
            if (array[i] > array[i + 1]) {
                tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                i --;
            }
            else{
                i++;
            }
            if (i > array.length - 2)
            {
                break;
            }
        }
    }

    public static void main(String[] args) {
	int[] array = new int[15];
    getRandomArray(array);
    printArray(array);

    sortArray(array);
    printArray(array);

    }
}
