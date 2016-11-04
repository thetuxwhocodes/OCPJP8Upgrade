package com.invincible.ocpjp8.java7.nio2;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author girish
 */
public class FileTreeWalk {

    public static void main(String[] args) {
        Path source = Paths.get("/home/girish/NetBeansProjects/OCPJP8Upgrade/src/studies/ocpjp");
        try {
            Files.walkFileTree(source, new MyFileVisitor());
        } catch (IOException ex) {
            Logger.getLogger(FileTreeWalk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

class MyFileVisitor extends SimpleFileVisitor<Path> {

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        System.out.println("File Name : " + file.getFileName());
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Directory Name : " + dir);
        return FileVisitResult.CONTINUE;
    }

}
