package day02;

import java.util.Arrays;

public class ArrayInsert {

    public static void main(String[] args) {

        int[] arr = {10, 50, 90, 100, 150};
        int newNumber = 66;
        int targetIndex = 2;
        int[] temp = new int[arr.length + 1];
        for (int i = 0; i < arr.length + 1; i++) {
            if(i < targetIndex) {
                temp[i] = arr[i];
            } else if (i == targetIndex) {
                temp[i] = newNumber;
            } else {
                temp[i] = arr[i - 1];
            }
        }
        arr = temp;
        temp = null;
        System.out.println("arr = " + Arrays.toString(arr));
    }
}
