package FileHandling.FilesNIO;


import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileNIOProblem1 {
    public static void main(String[] args) {
        Path filePath = Paths.get("destination.txt");

        try (Stream<String> data = Files.lines(filePath)) {
            data.forEach(System.out::println);
            System.out.println(data);

        } catch (Exception e) {
            System.out.println("" + e);
        }

    }
}
