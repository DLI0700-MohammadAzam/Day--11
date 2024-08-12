package FileHandling.FilesNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class FileNIOProblem2 {

    public static void main(String[] args) {
        Path filePath = Paths.get("fileNotExists.txt");
        Stream<String> data = null;
        try {
            data = Files.lines(filePath);
        } catch (IOException e) {
            System.out.println("Reason for the Exception : "+e.getMessage());
        }
        Path destinationPath = Paths.get("fileNIO.txt");

        try {
            Files.write(destinationPath, data.toList(),StandardOpenOption.CREATE,StandardOpenOption.APPEND);
        }catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
