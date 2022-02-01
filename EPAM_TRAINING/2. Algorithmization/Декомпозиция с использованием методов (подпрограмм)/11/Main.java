package com.company;

public class Main {

    public static void findValueWithMoreNumbers(int valueOne, int valueTwo)
    {
        String strOne = Integer.toString(valueOne);
        String strTwo = Integer.toString(valueTwo);
        if(strOne.length() > strTwo.length())
        {
            System.out.printf("Число %d имеет больше цифр чем число %d", valueOne, valueTwo);
        }
        else if(strOne.length() < strTwo.length())
        {
            System.out.printf("Число %d имеет больше цифр чем число %d", valueTwo, valueOne);
        }
        else//(strOne.length() == strTwo.length())
        {
            System.out.printf("Число %d и число %d имеют одиноковое число цифр", valueOne, valueTwo);
        }
    }

    public static void main(String[] args) {
        int valueOne = 15345;
        int valueTwo = 234556;
        findValueWithMoreNumbers(valueOne, valueTwo);
    }
}
