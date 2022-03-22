package com.company;

import java.util.ArrayList;

public class SoftwareEngineer extends Employee {

    public ArrayList<Project> projects = new ArrayList<>();

    public SoftwareEngineer(String name, String title, String branch, double salary, String team) {
        super(name, title, branch, salary);
    }

    public static ArrayList<Employee> getSoftwareEngineerStaff() {
        ArrayList<Employee> seStaff = new ArrayList<>();
        for (Employee e : Employee.employeeList) {
            if (e instanceof SoftwareEngineer) {
                seStaff.add(e);
            }
        }
        return seStaff;
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void removeProject(Project project) {
        projects.remove(project);
    }

}
