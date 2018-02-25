package com.company;

import java.io.IOException;
import java.nio.file.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Path filePath = Paths.get("Files/loremipsum.txt");

        System.out.println(filePath.getFileName());
        System.out.println(filePath.toAbsolutePath());

        Path newFilePath = Paths.get("Files/new.txt");

        try {
            Files.copy(filePath, newFilePath, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
