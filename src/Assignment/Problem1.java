package Assignment;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem1 {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("src\\Assignment\\source.txt");
             FileWriter writer = new FileWriter("destination.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                char w = (char) c;

                writer.write(w);


            }

        } catch (IOException e) {
            System.out.println(" " + e);
        }
    }
}
