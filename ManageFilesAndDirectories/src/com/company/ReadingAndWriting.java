package com.company;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.charset.Charset;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;

public class ReadingAndWriting {

    public static void main(String[] args) {

        Path source = Paths.get("Files/loremipsum.txt");
        Path destination = Paths.get("Files/new.txt");

        Charset charset = Charset.forName("US-ASCII");
        ArrayList<String> arrayList = new ArrayList<>();

        try (BufferedReader bufferedReader = Files.newBufferedReader(source, charset)) {

            String line = null;

            while ((line = bufferedReader.readLine()) != null) {
                arrayList.add(line);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(destination, charset)) {

            for (String line :
                    arrayList) {
                bufferedWriter.write(line+"\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
