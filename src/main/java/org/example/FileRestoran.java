package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileRestoran {
    private static void writeIntofile(String fileName, String text, boolean append) throws IOException {
        try (
                FileWriter fw = new FileWriter(fileName, append);
                BufferedWriter bw = new BufferedWriter(fw);

        ) {
            bw.write(text);
        }
    }

    public static void writeIntofile1(String fileName, String text) throws IOException {
        writeIntofile(fileName, text, false);
    }
}
