package com.company;

import java.util.Scanner;

public class ManagementSystem {

    public static Employee initializeNewEmployee() {


        Scanner input = new Scanner(System.in);
        String name;
        String title;
        String branch;
        double salary;
        while (true) {
            System.out.print("Full Name: ");
            name = input.nextLine();
            System.out.print("Title: ");
            title = input.nextLine();
            System.out.print("Branch: ");
            branch = input.nextLine();
            System.out.print("Salary: ");
            salary = input.nextDouble();

            System.out.println("===Please confirm the following details===");
            System.out.println("\tName: " + name);
            System.out.println("\tPosition: " + title);
            System.out.println("\tBranch: " + branch);
            System.out.println("\tSalary: " + salary);



            System.out.print("Confirm (y/n): ");
            String confirm = input.next();
            if (confirm.equals("y"))
                return new Employee(name, title, branch, salary);
        }
    }

}
