package sortingAlgoritm;

import java.util.Arrays;
//МЕТОД СОРТИРОВКИ ВСТАВКАМИ
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {13, 12, -45, 15, 16, 48, 79, 0 , 86, 54, 32, 1, 3, 8, -9, 6, -5, 4, 7};
        int k;
        for (int i = 1; i < arr.length; i++) {
            while (i > 0 && arr[i-1] > arr[i]) {
                k = arr[i-1];
                arr[i-1] = arr[i];
                arr[i] = k;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
