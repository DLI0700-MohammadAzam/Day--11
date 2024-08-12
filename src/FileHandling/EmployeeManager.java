package FileHandling;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {

    public static final String FILE_NAME = "employee.txt";
    static List<Employee> employees = new ArrayList<>();

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true)
        {
            System.out.println("Employee Management" );
            System.out.println("1. Add employee");
            System.out.println("2. Read employee");
            System.out.println("3. Update Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");



            int choice = input.nextInt();

            switch (choice)
            {
                case 1 -> addEmployee(input);
                case 2 -> readEmployee(FILE_NAME);
                case 3 -> updateEmployee(input);
                case 4 -> deleteEmployee(input);
                case 5 -> System.exit(0);

                default -> throw new IllegalStateException("Unexpected value: " + choice);
            }


        }


    }
    public static void addEmployee(Scanner input)
    {
        System.out.println("Enter Emp Id");
        int empId = input.nextInt();
        input.nextLine();
        System.out.println("Enter the Emp Name");
        String empName = input.nextLine();
        System.out.println("Enter the Emp salary");
        double empSalary = input.nextDouble();
        Employee e1 = new Employee(empId,empName,empSalary);
        employees.add(e1);
        writeEmployee(FILE_NAME);


    }
    static void writeEmployee(String FILE_NAME)
    {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME)))
        {
            for(Employee e : employees)
            {
                writer.write(e.toString());
                writer.newLine();
            }

        }catch (IOException e)
        {
            System.out.println(""+e);
        }
    }
    static void readEmployee(String FILE_NAME)
    {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {

            String line;
            int c=0;

                while ((line = reader.readLine()) != null) {
                    System.out.println(line);

                    c+=1;
                }
            if(line == null && c==0)
                System.out.println("Not data present");

            } catch (IOException e) {
                System.out.println(e);
            }

    }
    static void updateEmployee(Scanner input)
    {
        System.out.println("Enter EmpId to update");
        int empId = input.nextInt();
        input.nextLine();

       Employee exists =  searchEmployee(employees,empId);
       if(exists != null)
       {
           System.out.println("Enter Emp Name");
           String empName = input.nextLine();
           exists.setEmpName(empName);
           System.out.println("Enter Emp Salary");
           double empSalary = input.nextDouble();
           exists.setSalary(empSalary);
       }
       else
           System.out.println("Not found");
       writeEmployee(FILE_NAME);
    }
    static Employee searchEmployee(List<Employee> employees, int empId)
    {
        for(Employee employee : employees)
        {
            if(employee.getEmpId() == empId)
                return employee;
        }
        return null;
    }
    static void deleteEmployee(Scanner input)
    {
        System.out.println("Enter Emp Id");
        int empId = input.nextInt();
        Employee found = searchEmployee(employees,empId);
        if(found !=null)
        {
            employees.remove(found);
            System.out.println("removed employee with Id "+empId);
        }
        else
            System.out.println("Not found");

        writeEmployee(FILE_NAME);

    }
}
