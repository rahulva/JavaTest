package com.test.core.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFileMethods {
    public static void main(String[] args) throws IOException {
        Path tempDir = Paths.get("");
        Path demo = Files.createTempFile(tempDir, "demo", ".txt");
        Path filePath = Files.writeString(demo, "Sample text");
        String fileContent = Files.readString(filePath);
        //assertThat(fileContent).isEqualTo("Sample text");
    }
}
