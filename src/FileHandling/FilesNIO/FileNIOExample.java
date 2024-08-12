package FileHandling.FilesNIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class FileNIOExample {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String copyFile = "copyTest.txt";
        writeFile(fileName);
        readFile(fileName);
        copyFile(fileName,copyFile);


    }
    public static void writeFile(String fname)
    {
        Path filePath = Paths.get(fname);
        try {
            Files.write(filePath,"Hello wolrd FilesNIO".getBytes());
        } catch (IOException e) {
            System.out.println(""+e);
        }
    }
    public static void readFile(String fname )
    {
        Path fPath = Paths.get(fname);
        try {
            String content = Files.readString(fPath);
            System.out.println(content);
        }catch (IOException e)
        {
            System.out.println(""+e);
        }
    }
    public static void copyFile(String source,String destination)
    {
        Path sourcePath = Paths.get(source);
        Path destinationPath = Paths.get(destination);
        try{
            Files.copy(sourcePath,destinationPath, StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e)
        {
            System.out.println(""+e);
        }
    }
}
