package com.company;

public class Main {

    public static void main(String[] args) {
        Employee ceo = new Employee("John Johnson", "CEO", "Shanghai", 540_000);
        Employee se = new SoftwareEngineer("Jack Jackson", "Lead Engineer", "Tokyo", 170_000, "Tunnels Mobile App");
        Employee hr = new HR("Rich Richardson", "Hiring Manager", "Tokyo", 120_000);

        System.out.println(ceo.toString());

        System.out.println(((SoftwareEngineer) (se)).getTeam());

        System.out.println(Employee.numEmployees);
        System.out.println(Employee.employeeList);
        Employee.removeEmployee(ceo);
        System.out.println(Employee.employeeList);
    }
}
