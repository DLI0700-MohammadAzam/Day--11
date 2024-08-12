package FileHandling.FilesNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileNIOProblem5 {

    public static void main(String[] args) {
        Path fileName = Paths.get("user_input.txt");
        try {
            Files.delete(fileName);
        } catch (IOException e) {
            System.out.println(""+e);
        }
    }
}
