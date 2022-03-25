package com.geekbrains.Lesson_5;

import java.util.Random;

public class HomeWork5 {

    private static final int EMPLOYEE_COUNT = 5;
    private static final int MIN_AGE = 40;
    private static final Random ageRand = new Random();

    public static void main(String[] args) {
        Employee[] employees = new Employee[EMPLOYEE_COUNT];
        for (int i = 0; i < EMPLOYEE_COUNT; i++) {
            employees[i] = createEmployee(i);
        }
        for (Employee employee : employees) {
            if (employee.getAge() > MIN_AGE) {
                employee.printInfo();
            }
        }
    }
    private static Employee createEmployee(int i) {
        return new Employee(
                "name" + i,
                "surname" + i,
                "Engineer",
                "gb" + i + "@gb.com",
                "7977312571" + i,
                40000 + i * 4000,
                ageRand.nextInt(28) + 28);
    }
}
