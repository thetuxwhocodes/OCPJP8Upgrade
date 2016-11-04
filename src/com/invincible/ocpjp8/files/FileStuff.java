package com.invincible.ocpjp8.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class FileStuff {

    public static void main(String[] args) throws IOException {

        System.out.println("All files in current directory");
        Files.list(Paths.get(".")).forEach(System.out::println);

        System.out.println("All directories in current directory");
        Files.list(Paths.get(".")).filter(Files::isDirectory).forEach(System.out::println);
    }

}
