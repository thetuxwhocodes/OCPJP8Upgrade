package com.invincible.ocpjp8.java7.nio2;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author girish
 */
public class FileTreeWalkFind {

    public static void main(String[] args) {
        Path startPath = Paths.get("/home/girish/NetBeansProjects/OCPJP8Upgrade/src/studies/ocpjp");
        String pattern = "glob:*ocpjp*";
        try {
            Files.walkFileTree(startPath, new MyFileFindVisitor(pattern));
            System.out.println("File Search completed!");
        } catch (IOException ex) {
            Logger.getLogger(FileTreeWalk.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

class MyFileFindVisitor extends SimpleFileVisitor<Path> {

    private PathMatcher matcher;

    public MyFileFindVisitor(String pattern) {
        matcher = FileSystems.getDefault().getPathMatcher(pattern);
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        find(file);
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        find(dir);
        return FileVisitResult.CONTINUE;
    }

    private void find(Path path) {
        Path name = path.getFileName();
        if (matcher.matches(name)) {
            System.out.println("Matching File: " + name);
        }
    }

}
