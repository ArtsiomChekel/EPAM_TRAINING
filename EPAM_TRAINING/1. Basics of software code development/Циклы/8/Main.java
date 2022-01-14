import java.util.Scanner;

public class Pr1
{

    public static int amountOfNumbers(int value)
    {
            int num = 0;

            while (value > 0)
            {
                value /= 10;
                num++;
            }

            return num;
    }

    public static int[] makeArray(int value , int number)
        {
            int[] arr;
            arr = new int[number];

            for (int i = 0; i < number; i++)
                {
                arr [i] = value % 10;
                value /= 10;
            }
            return arr;
        }

    public static void reversArray(int[] array)
        {

         for(int i = 0; i < array.length / 2; i++)
             {
                int helpValue = array[i];
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = helpValue;
             }
        }
        public static void printArray(int[] array)
        {
            for (int i = 0; i < array.length; i++)
            {
                System.out.print(array[i] + " ");
            }
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        System.out.print("Количество цифр в первом числе: ");
        System.out.println(amountOfNumbers(num1));
        System.out.println();
        System.out.print("Количество цифр во втором числе: ");
        System.out.println(amountOfNumbers(num2));
        System.out.println();

        int[] arr1 = makeArray(num1, amountOfNumbers(num1));
        int[] arr2 = makeArray(num2, amountOfNumbers(num2));

        reversArray(arr1);

        System.out.print("Цифры из первого числа: ");
        printArray(arr1);

        reversArray(arr2);
        System.out.println();
        System.out.print("Цифры из второго числа: ");
        printArray(arr2);
        }
}
