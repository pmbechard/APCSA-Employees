package com.company;

public class Main {

    public static void main(String[] args) {
        Employee ceo = new HR("John Johnson", "CEO", "Shanghai", 540_000, "Payroll");
        SoftwareEngineer se = new SoftwareEngineer("Jack Jackson", "Lead Engineer", "Tokyo", 170_000, "Tunnels Mobile App");
        SoftwareEngineer se2 = new SoftwareEngineer("George Georgeson", "Junio Engineer", "Tokyo", 70_000, "Tunnels Mobile App");
        HR hr = new HR("Rich Richardson", "Hiring Manager", "Tokyo", 120_000, "Payroll");

        System.out.println(ceo.toString());

        System.out.println(Employee.numEmployees);
        System.out.println(Employee.employeeList);
        Employee.removeEmployee(ceo);
        System.out.println(Employee.employeeList);

        System.out.println(HR.getHRStaff());

        Project p1 = new Project("Project 1", "28 March 2022", "Mobile app for assignment submissions.");
        se.addProject(p1);
        se2.addProject(p1);
        System.out.println(p1.getAllEmployeesOnProject());

        

    }
}
