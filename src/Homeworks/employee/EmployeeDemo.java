package Homeworks.employee;

import java.util.Scanner;

public class EmployeeDemo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage storage = new EmployeeStorage();

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("""
                    Please choose an option:
                    0 - Exit
                    1 - Add employee
                    2 - Print all employees
                    3 - Search employee by ID
                    4 - Search employee by company name
                    """);

            int command = Integer.parseInt(scanner.nextLine());

            switch (command) {
                case 0:
                    isRunning = false;
                    System.out.println("Program ended.");
                    break;
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter surname: ");
                    String surname = scanner.nextLine();
                    System.out.print("Enter employee ID (e.g., A0001): ");
                    String id = scanner.nextLine();
                    System.out.print("Enter salary: ");
                    double salary = Double.parseDouble(scanner.nextLine());
                    System.out.print("Enter company: ");
                    String company = scanner.nextLine();
                    System.out.print("Enter position: ");
                    String position = scanner.nextLine();

                    Employee emp = new Employee(name, surname, id, salary, company, position);
                    storage.add(emp);
                    System.out.println("Employee added successfully!\n");
                    break;

                case 2:
                    storage.printAll();
                    break;

                case 3:
                    System.out.print("Enter employee ID: ");
                    String searchId = scanner.nextLine();
                    Employee found = storage.getById(searchId);
                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Employee not found with ID: " + searchId);
                    }
                    break;

                case 4:
                    System.out.print("Enter company name: ");
                    String companyName = scanner.nextLine();
                    storage.searchByCompany(companyName);
                    break;

                default:
                    System.out.println("Invalid command. Try again.");
            }
        }
    }
}



