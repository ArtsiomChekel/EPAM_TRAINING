
import java.util.Scanner;

public class Main
{
    public static void printArray(double [][] array)
    {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.printf("%.2f ",array[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите порядок квадратной матрицы n (четное): ");
        int n = in.nextInt();

        int numberOfPositive = 0;
            double [][] array = new double [n][n];

            for (int i = 0; i < array.length; i++)
            {
                for (int j = 0; j < array.length; j++)
                {
                    array[i][j] = Math.sin((i * i - j * j) / n);
                    if (array[i][j] > 0)
                    {
                        numberOfPositive++;
                    }
                }
            }
            printArray(array);
            System.out.println();
            System.out.println(numberOfPositive);


        }

}
