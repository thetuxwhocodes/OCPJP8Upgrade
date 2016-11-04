package com.invincible.ocpjp8.java7.nio2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

/**
 *
 * @author girish
 */
public class PathInfoTest {
    
    public static void main(String[] args) throws IOException {
        
        Path filePath = Paths.get("/home/girish/NetBeansProjects/../NetBeansProjects/OCPJP8Upgrade/src/studies/ocpjp/nio2/PathInfoTest.java");
        System.out.println("File Info: ");
        
        System.out.println("Root: " + filePath.getRoot());
        System.out.println("File Name: " + filePath.getFileName());
        System.out.println("Parent: " + filePath.getParent());
        System.out.println("Name Count: " + filePath.getNameCount());
        System.out.println("At Index 2: " + filePath.getName(2));
        System.out.println("subPath 3 to 5: " + filePath.subpath(3, 5));
        System.out.println("Absolute? : " + filePath.isAbsolute());
        
        System.out.println("Elements in Path: ");
        for(Path element : filePath){
            System.out.println(element);
        }

        System.out.println("After Normalize: " + filePath.normalize());
        System.out.println("SubPath: " + filePath.normalize().subpath(3, 4));
        
        System.out.println("File Exists? " + Files.exists(filePath, LinkOption.NOFOLLOW_LINKS));
        
        System.out.println("Readable? : " + Files.isReadable(filePath));
        System.out.println("Writable? : " + Files.isWritable(filePath));
        System.out.println("Executable? : " + Files.isExecutable(filePath));
        
        if (Files.exists(filePath, LinkOption.NOFOLLOW_LINKS)) {
        Map<String, Object> attributes = Files.readAttributes(filePath, "posix:*", LinkOption.NOFOLLOW_LINKS);
            System.out.println("File Attributes: " + attributes);
        } else {
            System.out.println("File Path " + filePath + " does not exist");
        }
        
        
    }
}
