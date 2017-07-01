package com.common.algorithms;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SortAlgorithmsTest {
    @Test
    void selectionSort() throws IOException {
        String arrayName = "numbers";
        String orderedArrayName = "numbers-ordered";

        int[] array = FileReaderToArray.read(arrayName, 10000);
        int[] expected = FileReaderToArray.read(orderedArrayName, 10000);

        int[] result = SortAlgorithms.selectionSort(array);

        Assert.assertArrayEquals(result, expected);
    }

}