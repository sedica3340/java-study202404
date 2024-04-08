package day02;

import java.util.Arrays;

public class ArrayPush {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40};
        int newNumber = 50;
        int[] newArray = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        newArray[numbers.length] = newNumber;
        numbers = newArray;

        newArray = null;

        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("newArray: " + Arrays.toString(newArray));
    }
}
