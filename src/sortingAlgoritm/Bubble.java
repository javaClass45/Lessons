package sortingAlgoritm;

import java.util.Arrays;
//Сортировка Пузырьком
public class Bubble {
    public static void main(String[] args) {

        int[] a = {10, 15, 16, 13, 12, 0, 18, 14, 17, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                int temp = 0;
                if (a[j] > a[j + 1]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Сортировка Пузырьком");
        System.out.println(Arrays.toString(a));
        
    }
}
