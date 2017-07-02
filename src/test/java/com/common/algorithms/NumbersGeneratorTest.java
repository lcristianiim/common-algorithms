package com.common.algorithms;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;


class NumbersGeneratorTest {
    @Test
    void generatorToFile() throws IOException {
        String unorderedArrayName = "../test-numbers";
        String orderedArrayName = "test-numbers-ordered";

        NumbersGenerator.generatorToFile(10000, unorderedArrayName);

        int[] array = FileReaderToArray.read(unorderedArrayName, 10000);
        int[] arrayOrdered = FileReaderToArray.read(orderedArrayName, 10000);

        deleteFiles(unorderedArrayName, orderedArrayName);

        Assert.assertEquals(array.length, arrayOrdered.length);
    }

    private void deleteFiles(String unorderedArrayName, String orderedArrayName) {
        File file1 = new File(unorderedArrayName);
        File file2 = new File(orderedArrayName);

        file1.delete();
        file2.delete();

        System.out.println("Test cleaning files");
    }
}