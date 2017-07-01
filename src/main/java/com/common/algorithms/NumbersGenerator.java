package com.common.algorithms;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.stream.IntStream;

@Getter
@Setter
@NoArgsConstructor
public class NumbersGenerator {

    public static void generatorToFile(int arrayLength, String fileName) throws IOException {
        Random r = new Random();
        int[] array = createRandomNumbersArray(arrayLength, r);

        write(fileName, array);

        Arrays.sort(array);

        String newFileName = fileName + "-ordered";
        write(newFileName, array);

        System.out.println("File: " + "'" + fileName + "'" + " saved as ordered list!");
        System.out.println("File: " + "'" + newFileName + "'" + " saved as unordered list!");
    }
    public static void displayArray(int[] array) {
        displayPrintMessage();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int[] createRandomNumbersArray(int arrayLength, Random r) {
        return r.ints(arrayLength, 0, arrayLength).toArray();
    }
    private static void write (String filename, int[]x) throws IOException {
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter(filename));
        for (int i = 0; i < x.length; i++) {
            // Maybe:
//            outputWriter.write(x[i]+"");
            // Or:
            outputWriter.write(Integer.toString(x[i]));
            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();
    }
    private static void displayPrintMessage() {
        System.out.println("PRINTING ARRAY");
        System.out.println("==============");
    }
}
