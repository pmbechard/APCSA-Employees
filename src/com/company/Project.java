package com.company;


import java.util.ArrayList;

public class Project {
    private final String projectName;
    private String deadline;
    private String description;

    public Project(String projectName, String deadline, String description) {
        this.projectName = projectName;
        this.deadline = deadline;
        this.description = description;
        Employee.projectsList.add(this);
    }

    public String getProjectName() {
        return projectName;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Employee> getAllEmployeesOnProject() {
        ArrayList<Employee> employees = new ArrayList<>();
        for (Employee e : Employee.employeeList) {
            if (e instanceof SoftwareEngineer && ((SoftwareEngineer) e).projects.contains(this)) {
                employees.add(e);
            }
        }
        return employees;
    }

    @Override
    public String toString() {
        return "Name: " + projectName + "\nDeadline: " + deadline + "\nDescription: " + description;
    }
}
