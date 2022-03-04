package com.company;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeBook {
    private final Map<String, Employee> employees = new HashMap();

    //Новые методы
    public Collection<Employee> getAllEmployees() {
        return employees.values();
    }


    public void addEmployee(String firstName, String lastName, String middleName, int department, double salary) {
        Employee emp = new Employee(firstName, lastName, middleName, department, salary);
        employees.put(emp.getFullName(), emp);
    }

    public void removeEmployeeById(String fullName) {
        if (employees.containsKey(fullName)) {
            employees.remove(fullName);
            return;
        } else {
            System.out.println("Работника с ФИО " + fullName + " не найдено. Удаление не выполнено!");
        }
    }

    public void printOfAllEmployeesInTheDepartment() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Отдел № " + j);
            for (Employee entry : employees.values()) {
                if (entry.getDepartment() == j) {
                    System.out.println(entry.getFullName());
                }
            }
        }
    }

    public void salaryChangeOfEmployee(String fullName, double newSalary) {
        if (employees.containsKey(fullName)) {
            employees.get(fullName).setSalary(newSalary);
        }
    }

    public void departmentChangeOfEmployee(String fullName, int newDepartment) {
        if (employees.containsKey(fullName)) {
            employees.get(fullName).setDepartment(newDepartment);
        }
    }

    //Старые методы
    public void printListOfEmployees() {
        for (Employee employee : employees.values()) {
            System.out.println(employee);
        }
    }

    public double amountOfSalaries() {
        double sum = 0;
        for (Employee employee : employees.values()) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public Employee minSalaryEmployee() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee maxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        double maxSalary = 0;
        for (Employee employee : employees.values()) {
            if (employee != null && employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    private int numberOfEmployees() {
        return employees.size();
    }

    public double averageValueOfSalaries() {
        return amountOfSalaries() / numberOfEmployees();
    }

    public void fullNameEmployees() {
        System.out.println("Ф. И. О. всех сотрудников: ");
        for (Employee employee : employees.values()) {
            System.out.println(employee.getFullName());
        }
    }

    public void salaryIndexing(double index) {
        for (Employee employee : employees.values()) {
            employee.indexSalary(index);
        }
    }

    public Employee minSalaryEmployeeInDepartment(int department) {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public Employee maxSalaryEmployeeInDepartment(int department) {
        Employee maxSalaryEmployee = null;
        double maxSalary = 0;
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double amountOfSalariesInDepartment(int department) {
        double sum = 0;
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private int numberOfEmployeesInDepartment(int department) {
        int numberOfEmployees = 0;
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getDepartment() == department) {
                numberOfEmployees++;
            }
        }
        return numberOfEmployees;
    }

    public double averageValueOfSalariesInDepartment(int department) {
        return amountOfSalariesInDepartment(department) / numberOfEmployeesInDepartment(department);
    }

    public void salaryIndexingInDepartment(int department, double index) {
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getDepartment() == department) {
                employee.indexSalary(index);
            }
        }
    }

    public void printListEmployeesInDepartment(int department) {
        System.out.println("Список всех сотрудников отдела № " + department + ": ");
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + " Зарплата: " + employee.getSalary());
            }
        }
    }

    public void employeesWithASalaryLessThanTheNumber(double number) {
        System.out.println("Список всех сотрудников с зарплатой меньше " + number + ": ");
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println(employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public void employeesWithASalaryGreaterThanTheNumber(double number) {
        System.out.println("Список всех сотрудников с зарплатой больше или равной " + number + ": ");
        for (Employee employee : employees.values()) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println(employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }
}


