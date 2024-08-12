package FileHandling.FilesNIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileNIOProblem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the file name ");
        String fileName = input.nextLine();
        Path find = Paths.get(fileName);
        boolean exists = Files.exists(find);
        System.out.println(find+" path exists t/f ->"+exists);
    }
}
