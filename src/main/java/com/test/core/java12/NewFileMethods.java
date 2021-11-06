package com.test.core.java12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NewFileMethods {
    public static void main(String[] args) throws IOException {
        Path filePath3 = Files.createTempFile("file3", ".txt");
        Path filePath4 = Files.createTempFile("file4", ".txt");
        Files.writeString(filePath3, "Java 12 Article");
        Files.writeString(filePath4, "Java 12 Tutorial");

        long mismatch = Files.mismatch(filePath3, filePath4);
        System.out.println("" + mismatch);
    }
}
