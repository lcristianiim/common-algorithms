package com.common.algorithms;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {

        FileReaderToArray fileReaderToArray = new FileReaderToArray();
        int[] array = fileReaderToArray.read("numbers", 1000);

    }
}
