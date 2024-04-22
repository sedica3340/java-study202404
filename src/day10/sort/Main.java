package day10.sort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {33, 11, 9, 100, 5789, 1, -55};
//        BubbleSort.sort(numbers);
//        SelectionSort.sort(numbers);
        InsertionSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));

    }
}
