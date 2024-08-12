package FileHandling.FilesNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileNIOProblem4 {
    public static void main(String[] args) {
        Path fileName = Paths.get("copyTest.txt");
        Path newName = Paths.get("renamed.txt");
        try {
            Files.move(fileName,newName, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(""+e);
        }
    }
}
