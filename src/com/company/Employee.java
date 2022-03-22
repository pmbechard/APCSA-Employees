package com.company;

import java.util.ArrayList;

abstract class Employee {
    private String name;
    private String title;
    private String branch;
    private double salary;
    private final int id;
    public static int numEmployees = 0;
    public static ArrayList<Employee> employeeList = new ArrayList<>();
    public static ArrayList<Project> projectsList = new ArrayList<>();
    // ^^

    public Employee(String name, String title, String branch, double salary) {
        this.name = name;
        this.title = title;
        this.branch = branch;
        this.salary = salary;
        numEmployees++;
        id = numEmployees;
        employeeList.add(this);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBranch() {
        return branch;
    }

    public void changeBranch(String branch) {
        this.branch = branch;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void removeEmployee(Employee e) {
        employeeList.remove(e);
        numEmployees--;
    }

    @Override
    public String toString() {
        return name + " (id: " + id + ") works as a " + title + " at " + branch + " for $" + salary + " annually.";
    }

    public boolean equals(Employee e) {
        if (id == e.id && name == e.name) {
            return true;
        } else {
            return false;
        }
    }

}
