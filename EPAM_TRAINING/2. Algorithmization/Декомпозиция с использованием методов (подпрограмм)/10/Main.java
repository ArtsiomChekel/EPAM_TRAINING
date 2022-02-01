package com.company;

public class Main {

    public static void printArray (int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static int[] createArrayFromValue(int value)
    {
        String str = Integer.toString(value);
        char[] charStr = str.toCharArray();
        int[] arrayFromValue = new int[str.length()];
        for(int i = 0; i < arrayFromValue.length; i++)
        {
            arrayFromValue[i] = Character.getNumericValue(charStr[i]);
        }
        return arrayFromValue;
    }

    public static void main(String[] args) {
	int value = 1534542;
    int[] arrayOfElements = createArrayFromValue(value);
    printArray(arrayOfElements);
    }
}
