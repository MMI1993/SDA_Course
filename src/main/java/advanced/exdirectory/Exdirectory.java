package main.java.advanced.exdirectory;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exdirectory {

    public static void main(String[] args) throws IOException {
        Path basePath = Paths.get("C:\\Users\\User\\Downloads\\SDA\\Java");
        if (!Files.isDirectory(basePath)) {
            Files.createDirectories(basePath);
        }
        Path filePath = basePath.resolve("test.txt");
        String text = "Java";
        Files.write(filePath, text.getBytes());
    }
}
