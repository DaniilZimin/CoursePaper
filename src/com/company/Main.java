package com.company;

public class Main {
    public static Employee[] employees = new Employee[10];

    public static void main(String[] args) {

        employees[0] = new Employee("Иван", "Иванов", "Иванович", 1, 58930);
        employees[1] = new Employee("Пётр", "Семенов", "Петрович", 2, 63730);
        employees[2] = new Employee("Дмитрий", "Казанцев", "Сергеевич", 3, 68232);
        employees[3] = new Employee("Евгений", "Самочкин", "Иванович", 4, 68232);
        employees[4] = new Employee("Алёша", "Соколов", "Сергеевич", 5, 68458);
        employees[5] = new Employee("Павел", "Пикулев", "Алексеевич", 1, 75930);
        employees[6] = new Employee("Игорь", "Андреев", "Сергеевич", 2, 89435);
        employees[7] = new Employee("Илья", "Филипов", "Алексеевич", 3, 49523);
        employees[8] = new Employee("Антон", "Назаров", "Иванович", 4, 63385);
        employees[9] = new Employee("Сергей", "Калинин", "Алексеевич", 5, 67490);

        printListOfEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + amountOfSalaries() + '\n');
        System.out.println("Сотрудник с минимальной зарплатой: " + '\n' + minSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + '\n' + maxSalaryEmployee());
        System.out.println("Среднее значение зарплат: " + averageValueOfSalaries() + '\n');
        fullNameEmployees();
        System.out.println();

        //Повышеная сложность
        System.out.println("===Повышеная сложность===");
        salaryIndexing(7.2);
        System.out.println("Сотрудник с минимальной зарплатой в отделе: " + '\n' + minSalaryEmployeeInDepartment(4));
        System.out.println("Сотрудник с максимальной зарплатой в отделе: " + '\n' + maxSalaryEmployeeInDepartment(2));
        System.out.println("Сумма затрат на зарплату по отделу: " + amountOfSalariesInDepartment(3) + '\n');
        System.out.println("Средняя зарплата по отделу: " + averageValueOfSalariesInDepartment(5) + '\n');
        salaryIndexingInDepartment(3, 4.6);
        printListEmployeesInDepartment(1);
        System.out.println();
        employeesWithASalaryGreaterThanTheNumber(58930);
        System.out.println();
        employeesWithASalaryLessThanTheNumber(58930);
    }

    public static void printListOfEmployees() {
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static double amountOfSalaries() {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee minSalaryEmployee() {
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

    public static Employee maxSalaryEmployee() {
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

    public static double averageValueOfSalaries() {
        return amountOfSalaries() / Employee.getCounterEmployee();
    }

    public static void fullNameEmployees() {
        System.out.println("Ф. И. О. всех сотрудников: ");
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    //Повышеная сложность
    public static void salaryIndexing(double index) {
        for (Employee employee : employees) {
            if (employee != null) {
                employee.indexSalary(index);
            }
        }
    }

    public static Employee minSalaryEmployeeInDepartment(int department) {
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

    public static Employee maxSalaryEmployeeInDepartment(int department) {
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

    public static double amountOfSalariesInDepartment(int department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static int numberOfEmployeesInDepartment(int department) {
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                numberOfEmployees++;
            }
        }
        return numberOfEmployees;
    }

    public static double averageValueOfSalariesInDepartment(int department) {
        return amountOfSalariesInDepartment(department) / numberOfEmployeesInDepartment(department);
    }

    public static void salaryIndexingInDepartment(int department, double index) {
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                employee.indexSalary(index);
            }
        }
    }

    public static void printListEmployeesInDepartment(int department) {
        System.out.println("Список всех сотрудников отдела № " + department + ": ");
        for (Employee employee : employees) {
            if (employee != null && employee.getDepartment() == department) {
                System.out.println(employee.getFullName() + " id: " + employee.getId() + " Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void employeesWithASalaryLessThanTheNumber(double number) {
        System.out.println("Список всех сотрудников с зарплатой меньше " + number + ": ");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < number) {
                System.out.println("id: " + employee.getId() + ", " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }

    public static void employeesWithASalaryGreaterThanTheNumber(double number) {
        System.out.println("Список всех сотрудников с зарплатой больше или равной " + number + ": ");
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() >= number) {
                System.out.println("id: " + employee.getId() + ", " + employee.getFullName() + ", Зарплата: " + employee.getSalary());
            }
        }
    }


}
