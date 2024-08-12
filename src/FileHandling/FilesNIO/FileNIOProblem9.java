package FileHandling.FilesNIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNIOProblem9 {
    public static void main(String[] args) {
        Path dir = Paths.get("src");
        try {
            Files.list(dir).forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
