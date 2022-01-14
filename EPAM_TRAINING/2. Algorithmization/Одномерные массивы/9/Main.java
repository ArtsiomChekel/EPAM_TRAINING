package com.company;


public class Main {

    public static void print(int [] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args)
    {
	int [] array = {1, 4, 3 , 1, 3, 7, 5, 8, 9, 2, 7, 5, 5, 7};
    int [] amountOfCopy = new int[array.length];




   for (int i = 0; i < array.length; i++) //Создание массива с количесвом повтора каждого элемента
    {
        for (int j = 0; j < array.length; j++)
        {
            if (array[i] == array[j])
            {
                amountOfCopy[i]++;
            }
        }
    }

    int maxFrequince = amountOfCopy[0];
    for (int i = 0; i < array.length; i++)
    {
        if (maxFrequince < amountOfCopy[i])
        {
            maxFrequince = amountOfCopy[i];
        }
    }
        int minValue = 0;
    for (int i = 0; i < array.length; i++)
    {
        if (maxFrequince == amountOfCopy[i])
        {
                minValue = array[i];
        }
    }
        for (int i = 0; i < array.length; i++)
        {
            if (maxFrequince == amountOfCopy[i] && minValue > array[i])
            {
                minValue = array[i];
            }
        }


    System.out.println("Исходный массив: ");
    print(array);

    System.out.println();

    System.out.println("Количество повторений элемента: ");
    print(amountOfCopy);

    System.out.println();
    System.out.println("Наименьшее и наиболее часто встречающееся число: " + minValue);

    }
    }
