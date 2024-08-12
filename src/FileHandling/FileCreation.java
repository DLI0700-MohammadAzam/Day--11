package FileHandling;

import java.io.File;
import java.io.IOException;

public class FileCreation {

    public static void main(String[] args) {
        File file = new File("newfile.txt");
        if(file.exists())
        {
            System.out.println("File Already Exits");
        }
        else {
            try {
                file.createNewFile();
                System.out.println("File is created ");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if(file.isDirectory())
            System.out.println("File is a directory");
        else
            System.out.println("Some other file");

        System.out.println("File name is "+file.getName());
        System.out.println("File Absolute path is "+file.getAbsolutePath());
        System.out.println("Writable "+file.canWrite());
        System.out.println("Readable "+file.canRead());
        System.out.println("Size of the file "+file.length());
    }

}
