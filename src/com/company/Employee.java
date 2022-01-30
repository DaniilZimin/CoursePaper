package com.company;

public class Employee {

    private String firstName;
    private String lastName;
    private String middleName;
    private int department;
    private double salary;
    private int id;

    private static int counterEmployee = 0;

    public Employee(String name, String lastName, String middleName, int department, double salary) {
        this.firstName = name;
        this.lastName = lastName;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = counterEmployee++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getFullName() {
        return getLastName() + " " + getFirstName() + " " + getMiddleName();
    }

    @Override
    public String toString() {
        return "Имя: " + firstName + '\n' +
                "Фамилия: " + lastName + '\n' +
                "Отчество: " + middleName + '\n' +
                "Отдел: " + department + '\n' +
                "Зарплата: " + salary + '\n' +
                "ID: " + id + '\n';
    }
}
