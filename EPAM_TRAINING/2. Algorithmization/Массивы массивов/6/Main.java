
import java.util.Scanner;

public class Main
{
    public static void printArray(int [][] array)
    {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите порядок квадратной матрицы n (четное): ");
        int n = in.nextInt();
        if (n % 2 != 0)
        {
            System.out.println("Введенное вами число не является четным!");
        }
        else
        {
            int [][] array = new int [n][n];

            for (int i = 0; i < array.length / 2; i++) { // Заполненіе верхней половіны матріцы
                for (int j = 0; j < array.length/2; j++) { // Заполненіе левой половіны
                    if (j >= i) {
                        array[i][j] = 1;}
                    else {
                        array[i][j] = 0;}
                }
                for (int k = array.length/2; k < array.length; k++) // Заполненіе парваой половіны
                {
                    if (k < (array.length - i)) {
                        array[i][k] = 1;}
                    else {
                        array[i][k] = 0;}
                }
            }
            for (int i = array.length/2; i < array.length; i++) { // Заполненіе ніжней половіны матріцы
                for (int j = 0; j < array.length/2; j++) { // Заполненіе левой половіны
                    if(i - 1 > (array.length/2 - j))
                    {array[i][j] = 1;}
                    else
                    {array[i][j] = 0;}
                }
                for (int k = array.length/2; k < array.length; k++) // Заполненіе парваой половіны
                {
                    if (i  >= (k)) {
                        array[i][k] = 1;}
                    else {
                        array[i][k] = 0;}
                }
            }
            printArray(array);


        }
    }
}
