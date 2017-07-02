package com.common.algorithms;

import java.time.Instant;
import java.util.Arrays;

import static com.common.algorithms.Utilities.exchange;
import static com.common.algorithms.Utilities.less;

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

    public static int[] quickSort(int[] array) {

        return array;
    }
}
