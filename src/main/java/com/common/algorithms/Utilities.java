package com.common.algorithms;

import java.time.Duration;
import java.time.Instant;

public class Utilities {
    public static boolean less(int valueA, int valueB) {
        if (valueA < valueB) {
            return true;
        }
        else return false;
    }

    public static void exchange(int[] array, int positionA, int b) {
        int temp = array[positionA];

        array[positionA] = array[b];
        array[b] = temp;
    }

    public static void displayTimeNeeded(String message, Instant start, Instant end) {
        System.out.println(Duration.between(start, end).getNano() + "    " + message + " took " + Duration.between(start, end).getNano() + " nano seconds");
    }
}
