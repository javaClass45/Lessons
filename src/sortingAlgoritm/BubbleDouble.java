package sortingAlgoritm;

import java.util.Arrays;

public class BubbleDouble {
    public static void main(String[] args) {

        var array = new int[]{9, 10, 5, 8, 7, 4, 6, 3, 2, 1, 65, 98, 74, 85, 62, 32, 41, 64};
        bubbleDoubleSorter(array);
        System.out.println("array = " + Arrays.toString(array));
    }

    private static void bubbleDoubleSorter(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    int tmp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = tmp;
                    isSorted = false;
                }
            }
        }
    }
}
