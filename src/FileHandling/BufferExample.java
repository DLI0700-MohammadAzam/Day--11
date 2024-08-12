package FileHandling;

import java.io.*;
import java.util.Scanner;

public class BufferExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("newfile.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("\n" + line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("newfile.txt", true))) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Write into the file");
            String input = sc.nextLine();
            writer.write(input + "\n");
            writer.write("Sai Prabhas hero..........!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
