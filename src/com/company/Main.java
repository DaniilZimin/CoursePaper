package com.company;

public class Main {
    public static void main(String[] args) {

        EmployeeBook book = new EmployeeBook();

        book.addEmployee("Иван", "Иванов", "Иванович", 1, 58930);
        book.addEmployee("Пётр", "Семенов", "Петрович", 2, 63730);
        book.addEmployee("Дмитрий", "Казанцев", "Сергеевич", 3, 68232);
        book.addEmployee("Евгений", "Самочкин", "Иванович", 4, 68232);
        book.addEmployee("Алёша", "Соколов", "Сергеевич", 5, 68458);
        book.addEmployee("Павел", "Пикулев", "Алексеевич", 1, 75930);
        book.addEmployee("Игорь", "Андреев", "Сергеевич", 2, 89435);
        book.addEmployee("Илья", "Филипов", "Алексеевич", 3, 49523);
        book.addEmployee("Антон", "Назаров", "Иванович", 4, 63385);
        book.addEmployee("Сергей", "Калинин", "Алексеевич", 5, 67490);
        book.addEmployee("Анатолий", "Бобров", "Владимирович", 5, 67490);

        book.removeEmployeeById(1);
        book.salaryChangeOfEmployee("Иван", "Иванов", "Иванович", 23077);
        book.departmentChangeOfEmployee("Иван", "Иванов", "Иванович", 4);
        book.printOfAllEmployeesInTheDepartment();
    }
}
