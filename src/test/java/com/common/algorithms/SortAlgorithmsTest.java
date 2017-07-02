package com.common.algorithms;

import lombok.Getter;
import lombok.Setter;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.time.Instant;

import static com.common.algorithms.Utilities.displayTimeNeeded;

@Getter
@Setter
public class SortAlgorithmsTest {

    private String tenArray = System.getProperty("user.dir") + "/src/data/10/numbers";
    private String tenArrayOrdered = System.getProperty("user.dir") + "/src/data/10/numbers-ordered";

    private String tenThousandArray = System.getProperty("user.dir") + "/src/data/10000/numbers";
    private String tenThousandArrayOrdered = System.getProperty("user.dir") + "/src/data/10000/numbers-ordered";

    @Test
    public void selectionSort() throws IOException {
        String methodName = "Selection Sort";

        int[] array = FileReaderToArray.read(tenThousandArray, 10000);
        int[] expected = FileReaderToArray.read(tenThousandArrayOrdered, 10000);

        Instant start = Instant.now();

        int[] result = SortAlgorithms.selectionSort(array);

        Instant end = Instant.now();

        displayTimeNeeded(methodName, start, end);
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void bubbleSort() throws IOException {
        String methodName = "Bubble sort";

        int[] array = FileReaderToArray.read(tenThousandArray, 10000);
        int[] expected = FileReaderToArray.read(tenThousandArrayOrdered, 10000);

        Instant start = Instant.now();

        int[] result = SortAlgorithms.bubbleSort(array);

        Instant end = Instant.now();

        displayTimeNeeded(methodName, start, end);
        Assert.assertArrayEquals(result, expected);
    }

    @Test
    public void quickSort() throws IOException {
        String methodName = "Quick sort";

        int[] array = FileReaderToArray.read(tenThousandArray, 10000);
        int[] expected = FileReaderToArray.read(tenThousandArrayOrdered, 10000);

        Instant start = Instant.now();

        int[] result = SortAlgorithms.quickSort(array);

        Instant end = Instant.now();

        displayTimeNeeded(methodName, start, end);
        Assert.assertArrayEquals(result, expected);

    }

}