package com.common.algorithms;

import static com.common.algorithms.utils.Utilities.exchange;
import static com.common.algorithms.utils.Utilities.less;

public class SortAlgorithms {

    public static int[] selectionSort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int minPosition = i;

            for(int j = i + 1; j < array.length; j++) {
                if (less(array[j], array[minPosition]) ) {
                    minPosition = j;
                }
            }
            exchange(array, i, minPosition);
        }

       return array;
    }

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - 1; j++) {
                    if(less(array[j+1], array[j])) {
                        exchange(array, j+1, j);
                    }
                }

            }
        return array;
    }

    public static int[] quickSort(int[] array, int lo, int hi) {

        if (lo < hi) {
            int p = partioning(array, lo, hi);
            quickSort(array, lo, p - 1);
            quickSort(array, p + 1, hi);
        }

        return array;
    }

    private static int partioning(int[] array, int lo, int hi) {
        int pivot = array[hi];
        int i = lo - 1;

        for (int j = lo; j <= hi; j++) {
            if (array[j] <= pivot) {
                i++;
                if (i != j) {
                    exchange(array, i, j);
                }
            }
        }
        return i;
    }


    public static int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j > 0 && less(array[j], array[j-1]); j--) {
                exchange(array, j, j-1);
            }
        }

        return array;
    }
}
