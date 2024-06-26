package day10.sort;

public class BubbleSort {
    public static void sort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int temp;
        temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
