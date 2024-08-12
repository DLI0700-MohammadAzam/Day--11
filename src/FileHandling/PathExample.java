package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {
    public static void main(String[] args) {
        Path path = Paths.get("fileNotExists.txt");// returns the path of the file
        System.out.println("Absolute Path : " + path.toAbsolutePath());
        System.out.println("Path :" + path);
        System.out.println("File Name " + path.getFileName());
        System.out.println("Root :" + path.getRoot());


        try {
            if (!Files.exists(path))
                    Files.createFile(path);
            else
                System.out.println("File Already exits");
        } catch (IOException e) {
            System.out.println(""+e);
        }

    }
}
