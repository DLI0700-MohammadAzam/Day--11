package Assignment;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Problem3 {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("user_input.txt")){

            Scanner input = new Scanner(System.in);
            System.out.println("Enter the text ");
           String  text = input.nextLine();
           writer.write(text);
        }catch(IOException e)
        {
            System.out.println(""+e);
        }
    }
}
