package com.company;

public class Employee {

    private String name;
    private String surName;
    private String middleName;
    private int department;
    private double salary;
    private int id;

    private static int counterEmployee = 0;

    public Employee(String name, String surName, String middleName, int department, double salary) {
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counterEmployee++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getCounterEmployee() {
        return counterEmployee;
    }

    @Override
    public String toString() {
        return "name: " + name + '\n' +
                "surName: " + surName + '\n' +
                "middleName: " + middleName + '\n' +
                "department: " + department + '\n' +
                "salary: " + salary + '\n' +
                "id: " + id + '\n';
    }
}
