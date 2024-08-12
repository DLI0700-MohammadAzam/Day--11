package FileHandling;

import java.io.*;
import java.util.Scanner;

public class FIleWriteExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try (FileWriter write = new FileWriter("newfile.txt");) {
            System.out.println("Enter the data");
            String line = input.nextLine();
            write.write(line);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileReader fileReader = new FileReader("newfile.txt"))
        {
            int character;
            while ((character =fileReader.read() )!=-1)
            {
                System.out.print((char) character);
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}