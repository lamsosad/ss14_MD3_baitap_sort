package bai1_motasapxepchen;

public class Bai1 {
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Di chuyển các phần tử của mảng arr[0..i-1], có giá trị lớn hơn key,
               đến vị trí của chúng một vị trí phía trước so với vị trí hiện tại */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 11, 13, 5, 6 };
        insertionSort(arr);
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}
