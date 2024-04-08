package day02;

import java.util.Arrays;

public class ArrayPop {

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};

        int[] temp = new int[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i++) {
            temp[i] = numbers[i];
        }
        int removedNumber = numbers[numbers.length - 1];
        numbers = temp;
        temp = null;
        System.out.println("numbers:" + Arrays.toString(numbers));
        System.out.println("temp:" + Arrays.toString(temp));
        System.out.println("removedNumber = " + removedNumber);

    }
}
