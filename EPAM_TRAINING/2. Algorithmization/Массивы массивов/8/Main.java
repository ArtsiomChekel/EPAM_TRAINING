
import java.util.Scanner;

public class Main
{
    public static void printArray(int[][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

               int [][] array = new int [4][5];
        for (int i = 0; i < array.length; i++)
        {
              for (int j = 0; j < array.length; j++)
                 {
                        array[i][j] = (int) (Math.random() * 15);
                 }
        }
        printArray(array);

        System.out.print("Введите номер первого столбца n: ");
        int n = in.nextInt();

        System.out.print("Введите номер второго столбца n: ");
        int m = in.nextInt();



        int [] columm = new int[array.length];

        for (int i = 0; i < array.length; i++)
        {
            columm[i] = array[i][n];
        }
        for (int i = 0; i < array.length; i++)
        {
            array[i][n] = array[i][m];
        }
        for (int i = 0; i < array.length; i++)
        {
            array[i][m] = columm[i];
        }

        System.out.println();
        printArray(array);

    }

}