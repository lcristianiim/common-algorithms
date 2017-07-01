package com.common.algorithms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.Arrays;

public class FileReaderToArray {

    public static int[] read(String filename, int arrayLength) throws IOException {
        int[] array = new int[arrayLength];
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        String line;
        int index = 0;

        while ((line = bufferedReader.readLine()) != null) {
            array[index] = Integer.decode(line);
            if (index < arrayLength - 1) {
                index++;
            }
        }
        return array;
    }
}
