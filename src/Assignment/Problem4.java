package Assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Problem4 {
    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("destination.txt"))) {
            String line;
            int count =0;
            while ((line = reader.readLine()) !=null)
            {
                count += line.split(" ").length;
            }
            System.out.println("Total number of the words "+count);

        }catch (IOException e)
        {
            System.out.println(""+e);
        }
    }
}
