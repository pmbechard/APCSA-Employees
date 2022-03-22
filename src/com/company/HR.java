package com.company;

import java.util.ArrayList;

public class HR extends Employee {

    private String department;

    public HR(String name, String title, String branch, double salary, String department) {
        super(name, title, branch, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static ArrayList<Employee> getHRStaff() {
        ArrayList<Employee> hrStaff = new ArrayList<>();
        for (Employee e : Employee.employeeList) {
            if (e instanceof HR) {
                hrStaff.add(e);
            }
        }
        return hrStaff;
    }

}
