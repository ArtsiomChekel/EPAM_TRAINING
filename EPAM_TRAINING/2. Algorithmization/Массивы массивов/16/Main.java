package com.company;
import java.util.Scanner;



public class Main {

    public static int findSumOfStringElementsOfArray(int[][]array, int numOfString)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[numOfString][i];
        }
        return sum;
    }

    public static int findSumOfColummsElementsOfArray(int[][]array, int numOfColumm)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i][numOfColumm];
        }
        return sum;
    }

    public static int findSumOfDiagonalsElementsOfArray(int[][]array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++)
        {
            sum += array[i][i];
        }
        return sum;
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length + 1; i++) {
            if (i < array.length) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + "\t");
                }
                System.out.print("Сумма = " + findSumOfStringElementsOfArray(array, i) + "\t");
                System.out.println();
            }
            else{
                for (int j = 0; j < array.length; j++) {
                    System.out.print(findSumOfColummsElementsOfArray(array, j) + "\t");
                }
                System.out.println("Сумма элементов на диагонале = " + findSumOfDiagonalsElementsOfArray(array));
            }
        }
    }

    public static void createMagicSquereOdd(int[][] array)
    {
        int count = 1;
        int i = 0;
        int j = array.length / 2;

        for (int k = 0; k < (Math.pow(array.length, 2)); k++)
        {
            array[i][j] = count;
            if (((i == 0) && (j >= array.length - 1)) && (array[array.length - 1][0] != 0)) {
                i++;
            }

            else
            {
                i--;
                if (i < 0)
                {
                    i = array.length - 1;
                }
                j++;
                if (j == array.length)
                {
                    j = 0;
                }
                if (array[i][j] != 0)
                {
                    i+=2;
                    j--;
                }
            }
            count++;
        }
    }

    public static void createMagicSquereEvenHalf(int[][] array)
    {
        int[][] tmpArray = new int[array.length / 2][array.length / 2];
        createMagicSquereOdd(tmpArray);
        int constNumber = (int) Math.pow(array.length, 2) / 4;
        //Заполнение матрицы по квадрантам магическим квадратом нечетного порядка
        for (int i = 0; i < array.length / 2; i++) //Левый верхний квадрант
        {
            for (int j = 0; j < array.length / 2; j++)
            {
                array[i][j] = tmpArray[i][j];
            }
        }

        for (int i = array.length / 2; i < array.length; i++) //Левый нижний квадрант
        {
            for (int j = 0; j < array.length / 2; j++)
            {
                array[i][j] = tmpArray[i - array.length / 2][j] + (constNumber * 3);
            }
        }

        for (int i = 0; i < array.length / 2; i++) //Правый верхний квадрант
        {
            for (int j = array.length / 2; j < array.length; j++)
            {
                array[i][j] = tmpArray[i][j - array.length / 2] + (constNumber * 2);
            }
        }

        for (int i = array.length / 2; i < array.length; i++) //Правый нижний квадрант
        {
            for (int j = array.length / 2; j < array.length; j++)
            {
                array[i][j] = tmpArray[i - array.length / 2][j - array.length / 2] + constNumber;
            }
        }

        //Замена элементов для сохранения магичности квадрата
        int tmpValue = 0;
        //Замена элементов первого столбца
        tmpValue = array[0][0];
        array[0][0] = array[array.length / 2][0];
        array[array.length / 2][0] = tmpValue;

        tmpValue = array[array.length / 2 - 1][0];
        array[array.length / 2 - 1][0] = array[array.length - 1][0];
        array[array.length - 1][0] = tmpValue;

        //Замена элементов второго столбца
        for (int i = 1; i < (array.length / 2 - 1); i++)
        {
            tmpValue = array[i][1];
            array[i][1] = array[i + (array.length / 2)][1];
            array[i + (array.length / 2)][1] = tmpValue;
        }

        //Замена серединных столбцов
        for (int i = array.length / 2 - (array.length / 2 - 3) / 2; i < (array.length / 2 + ((array.length / 2 - 3) / 2)); i++)
        {
            for (int j = 0; j < array.length / 2; j++)
            {
                tmpValue = array[j][i];
                array[j][i] = array[j + array.length / 2][i];
                array[j + array.length / 2 ][i] = tmpValue;
            }
        }
    }

    public static void createMagicSquereEven(int[][] array)
    {
        int n = array.length;
        int num = 1;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array.length; j++)
            {
                if (i < n/4 && j < n/4) { //Условие заполнения верхнего левого квадратика
                    array[i][j] = num;
                }
                if (i < n/4 && j > array.length -1 - n/4) { //Условие заполнения верхнего правого квадратика
                    array[i][j] = num;
                }
                if ((i >= n/4 && j >= n/4) && (i <= array.length - 1 - n/4 && j <= array.length - 1 - n/4)) { //Условие заполнения среднего квадрата
                    array[i][j] = num;
                }
                if (i > array.length -1 - n/4 && j < n/4) { //Условие заполнения нижнего левого квадратика
                    array[i][j] = num;
                }
                if (i > array.length -1 - n/4 && j > array.length -1 - n/4) { //Условие заполнения нижнего правого квадратика
                    array[i][j] = num;
                }
                num++;
            }
        }
        // Заполение пустых ячеек магическогоквадрата
        num = 1;
        for (int i = array.length - 1; i >= 0; i--)
        {
            for (int j = array.length - 1; j >= 0; j --)
            {
                if (array[i][j] == 0){
                    array[i][j] = num;
                }
                num++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размерность магического квадрата n: ");
        int n = in.nextInt();
        int[][] array = new int [n][n];
        int magicConst = (n * (n * n + 1)) / 2;
        if (n % 2 != 0) {
            createMagicSquereOdd(array);
        }
        else if (n % 2 == 0 && n % 4 !=0)
        {
            createMagicSquereEvenHalf(array);
        }
        else if (n % 2 == 0 && n % 4 ==0)
        {
            createMagicSquereEven(array);
        }
        printArray(array);
        System.out.println();
        System.out.println("Магическая константа равна = " + magicConst);

    }
}
