package Assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FilteredTransactions {
    static final double THRESHOLD = 3000d;

    public static void main(String[] args) {
        List<String> transaction = new ArrayList<>();
        List<String> filtered_list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/Assignment/transactions.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/Assignment/filtered_transactions.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {
                transaction.add(line);
            }
            System.out.println(transaction);
            for (String t_r : transaction) {

                String s = t_r.split("->")[2];
                if (Double.parseDouble(s) > THRESHOLD) {
                    filtered_list.add(t_r);
                }

            }
            for (String filter : filtered_list) {
                writer.write(filter);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("" + e);
        }
    }
}
