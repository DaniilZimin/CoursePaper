package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeBook {
    private List<Employee> employees = new ArrayList<>();

    //Новые методы
    public List<Employee> getAllEmployees() {
        return employees;
    }

    public void addEmployee(String firstName, String lastName, String middleName, int department, double salary) {
        employees.add(new Employee(firstName, lastName, middleName, department, salary));
    }

    public void removeEmployeeById(int id) {
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            if (emp != null && emp.getId() == id) {
                employees.remove(emp);
                return;
            }
        }
        System.out.println("Работника с ID " + id + " не найдено. Удаление не выполнено!");
    }

    public void printOfAllEmployeesInTheDepartment() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("Отдел № " + j);
            for (Employee employee : employees) {
                if (employee != null && employee.getDepartment() == j) {
                    System.out.println(employee.getFullName());
                }
            }
        }
    }

    public void salaryChangeOfEmployee(String firstName, String lastName, String middleName, double newSalary) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFirstName().equals(firstName)
                    && employee.getLastName().equals(lastName)
                    && employee.getMiddleName().equals(middleName)) {
                employee.setSalary(newSalary);
            }
        }
    }

    public void departmentChangeOfEmployee(String firstName, String lastName, String middleName, int newDepartment) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFirstName().equals(firstName)
                    && employee.getLastName().equals(lastName)
                    && employee.getMiddleName().equals(middleName)) {
                employee.setDepartment(newDepartment);
            }
        }
    }

    //Старые методы
    public void printListOfEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public double amountOfSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public Employee minSalaryEmployee() {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
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
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    private int numberOfEmployees() {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                numberOfEmployees++;
            }
        }
        return numberOfEmployees;
    }

    public double averageValueOfSalaries() {
        return amountOfSalaries() / numberOfEmployees();
    }

    public void fullNameEmployees() {
        System.out.println("Ф. И. О. всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public void salaryIndexing(double index) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.indexSalary(index);
            }
        }
    }

    public Employee minSalaryEmployeeInDepartment(int department) {
        Employee minSalaryEmployee = null;
        double minSalary = Double.MAX_VALUE;
        for (Employee employee : employees) {
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
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department && employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public double amountOfSalariesInDepartment(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    private int numberOfEmployeesInDepartment(int department) {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
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
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.indexSalary(index);
            }
        }
    }

    public void printListEmployeesInDepartment(int department) {
        System.out.println("Список всех сотрудников отдела № " + department + ": ");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + " id: " + employee.getId() + " Зарплата: " + employee.getSalary());
            }
        }
    }

    public void employeesWithASalaryLessThanTheNumber(double number) {
        System.out.println("Список всех сотрудников с зарплатой меньше " + number + ": ");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println("id: " + employee.getId() + ", " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public void employeesWithASalaryGreaterThanTheNumber(double number) {
        System.out.println("Список всех сотрудников с зарплатой больше или равной " + number + ": ");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println("id: " + employee.getId() + ", " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }
}


