package com.company;

public class SoftwareEngineer extends Employee {

    private String team;

    public SoftwareEngineer(String name, String title, String branch, double salary, String team) {
        super(name, title, branch, salary);
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }


}
