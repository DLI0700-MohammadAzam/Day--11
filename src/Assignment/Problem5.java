package Assignment;

import java.io.*;

public class Problem5 {

    public static void main(String[] args) {
        StringBuilder revert = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("newfile.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("reversed.txt", true))) {
            String line;
            while ((line = reader.readLine()) != null) {
                revert.append(line);
            }
            revert.reverse();
            System.out.println(revert);
            writer.write(revert.toString());

        } catch (IOException e) {
            System.out.println("" + e);
        }
    }
}
