package bai2_caidat;

import java.util.Arrays;

public class Bai2 {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 5, 6 };
        System.out.println("Mảng trước khi sắp xếp: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
