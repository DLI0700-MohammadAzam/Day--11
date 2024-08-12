package FileHandling.FilesNIO;

import java.io.IOException;
import java.nio.file.*;

public class FileNIOProblem3 {
    public static void main(String[] args) {
        Path sourcePath = Paths.get("test.txt");
        Path destination = Paths.get("copyFilesDest.txt");
        try {
            Files.copy(sourcePath,destination, StandardCopyOption.REPLACE_EXISTING );
        } catch (IOException e) {
            System.out.println(" "+e);
        }
    }
}
