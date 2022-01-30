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

        listOfEmployees();
        System.out.println("Сумма затрат на зарплаты в месяц: " + amountOfSalaries() + '\n');
        System.out.println("Сотрудник с минимальной зарплатой: " + '\n' + minSalaryEmployee());
        System.out.println("Сотрудник с максимальной зарплатой: " + '\n' + maxSalaryEmployee());
        System.out.println("Среднее значение зарплат: " + averageValueOfSalaries() + '\n');
        fullNameEmployees();
    }

    public static void listOfEmployees() {
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
            if (employee != null) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    minSalaryEmployee = employee;
                }
            }
        }
        return minSalaryEmployee;
    }

    public static Employee maxSalaryEmployee() {
        Employee maxSalaryEmployee = null;
        double maxSalary = Double.MIN_VALUE;
        for (Employee employee : employees) {
            if (employee != null) {
                if (employee.getSalary() > maxSalary) {
                    maxSalary = employee.getSalary();
                    maxSalaryEmployee = employee;
                }
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
                System.out.println("Фамилия: " + employee.getSurName() + " Имя: " + employee.getName() + " Отчество: " + employee.getMiddleName() + ";");
            }
        }
    }
}
