package com.company;

public class Main {

    public static void getRandomArray (int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = (int) (Math.random() * 100);
        }
        System.out.println();
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
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

    public static void searchOfRightPlace (int[] array1, int[] array2)
    {
        if(array2[0] <= array1[0])
        {
            System.out.printf("Элемент второй последовательности: %d, необходимо вставить перед элементом " +
                    " второй последовательности: %d\n", array2[0], array1[0]);
        }
        for(int i = 0; i < array2.length; i++)
        {
            for (int j = 0; j < array1.length - 1; j++)
            {
                if(array2[i] >= array1[j] && array2[i] <= array1[j + 1])
                {
                    System.out.printf("Элемент второй последовательности: %d, необходимо вставить за элементом " +
                            " второй последовательности: %d\n", array2[i], array1[j]);

                }

            }
        }
        if(array2[array2.length - 1] >= array1[array1.length - 1])
        {
            System.out.printf("Элемент второй последовательности: %d, необходимо вставить после элемента " +
                    " второй последовательности: %d\n", array2[array2.length - 1], array1[array1.length - 1]);
        }
    }

    public static void main(String[] args) {
        int[] array1 = new int[15];
        getRandomArray(array1);
        sortArray(array1);
        int[] array2 = {1, 24, 66, 34, 100};
      //  getRandomArray(array2);
        sortArray(array2);
        printArray(array1);
        printArray(array2);

        searchOfRightPlace(array1, array2);
    }
}
