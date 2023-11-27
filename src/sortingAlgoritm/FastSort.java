package sortingAlgoritm;

import java.util.Arrays;

public class FastSort {
    public static void main(String[] args) {
        var array = new int[]{9, 10, 5, 8, 7, 4, 6, 3, 2, 1, 65, 98, 74, 85, 62, 32, 41, 64};

        fastSort(array, 0, array.length - 1 );
        System.out.println("array = " + Arrays.toString(array));

    }

    private static void fastSort(int[] array, int from, int to) {
        if (from < to) {
            int devIndex = partition(array, from, to);
            fastSort(array, from, devIndex - 1);
            fastSort(array, devIndex, to);

        }

    }

    private static int partition(int[] array, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;

        int pivot = array[from + (to - from) / 2];
        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;

            }

        }

        return leftIndex;
    }

    private static void swap(int[] array, int rightIndex, int leftIndex) {
        int tmp = array[rightIndex];
        array[rightIndex] = array[leftIndex];
        array[leftIndex] = tmp;
    }


}
