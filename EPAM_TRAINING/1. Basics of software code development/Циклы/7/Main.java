import java.io.InputStream;
import java.util.Scanner;

public class Class {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число отрезка: ");
        int m = in.nextInt();
        System.out.print("Введите второе число отрезка: ");
        int n = in.nextInt();
        int countOfDividers = 0;

        for (int i = m; i < n; i++)
        {
            for (int j = 2; j < i; j++)
            {
                if (i % j == 0)
                {
                    System.out.println("Число " + i + " Делитель " + j);
                    countOfDividers++;
                }
            }
        }
        if (countOfDividers == 0)
        {
            System.out.println("Попробуйте ввести другие числа");
        }
    }
}
