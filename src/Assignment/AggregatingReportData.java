package Assignment;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AggregatingReportData {
    public static void main(String[] args) {
        List<String> logs = new ArrayList<>();
        List<String> levels = new ArrayList<>();
        Map<String, Long> log_summary = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("src/Assignment/logs.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("o log_summary.txt"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                logs.add(line);
            }
            for (String log : logs) {
                String lev = log.split(",")[1];
                levels.add(lev);
            }
            System.out.println(levels);
             log_summary = levels.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            writer.write(log_summary.toString());

        } catch (IOException e) {
            System.out.println("" + e);
        }
    }
}
