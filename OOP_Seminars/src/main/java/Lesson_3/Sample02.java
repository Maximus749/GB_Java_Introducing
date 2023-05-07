package Lesson_3;

import java.util.*;

public class Sample02 {
    private static Random random = new Random();
    public static Date date = new Date();
    public int currentYear = date.getYear() + 1900;

    static Employee generateEmployee() {
        String[] statuses = {"worker", "freelancer"};
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Владимир", "Шрек", "Евгений", "Иван"};
        String[] surNames = new String[]{"Григорьев", "Шубин", "Фокин", "Шестаков", "Хохлов", "Иванов", "Петров", "Чернов", "Гильфанов", "Патысьев"};

        int yerOfBirth = random.nextInt(1970, 2004);
        int salary = random.nextInt(20000, 100000);
        int dayRate = random.nextInt(1000, 3000);
        int days = random.nextInt(5, 30);
        if (random.nextInt(2) == 0) {
            return new Worker("Работник", names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], (date.getYear() + 1900 - yerOfBirth), salary);
        }
        else {
            return new Freelancer("Наемник", names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], (date.getYear() + 1900 - yerOfBirth), dayRate * days);
        }
    }
    public static void main(String[] args) {
//        Worker worker01 = new Worker("Работник", "Анатолий", "Шестаков", 1988, 80000);
//        System.out.println(worker01);

        Employee[] emploees = new Employee[10];
        for (int i = 0; i < emploees.length; i++) {
            emploees[i] = generateEmployee();
        }
        for (Employee employee: emploees) {
            System.out.println(employee);
        }
        System.out.println("=-".repeat(30));


        System.out.println("Отсортированный список сотрудников:");
        Arrays.sort(emploees, new StatusComparator());
        for (Employee employee: emploees) {
            System.out.println(employee);
        }
        System.out.println("=-".repeat(30));
        Arrays.sort(emploees);
        for (Employee employee: emploees) {
            System.out.println(employee);
        }
    }

}
class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.calculateSalary(), o2.calculateSalary());
    }
}
class StatusComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.status.compareTo(o2.status);
    }
}

abstract class Employee implements  Comparable<Employee>{

    protected String status;
    protected String name;
    protected String surName;
    protected int age;
    protected double salary;

    public Employee(String status, String name, String surName, int age, double salary) {
        this.status = status;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.salary = salary;
    }

    public abstract double calculateSalary();

    public int calculateAge() {
        return age;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(calculateAge(), o.calculateAge());
    }
//        @Override
//    public int compareTo(Employee o) {
//        return Double.compare(calculateSalary(), o.calculateSalary());
//    }

}

class Worker extends Employee {

    public Worker(String status, String name, String surName, int age, double salary) {
        super(status, name, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s, %d лет, зарплата по окладу %.2f рублей.\n",status, name, surName, age, salary);
    }

    @Override
    public int calculateAge() {
        return age;
    }

}
class Freelancer extends Employee {

    public Freelancer(String status, String name, String surName, int yearOfBirth, double salary) {
        super(status, name, surName, yearOfBirth, salary);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s, %d лет, зарплата за отработанные дни %.2f рублей.\n",status, name, surName, age, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public int calculateAge() {
        return age;
    }
}

/**
 * Доработать приложение, которое мы разрабатывали на уроке. Мы доллжны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.
 * Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
 * Переработать метод generateEmployee, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
 * Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
 * Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.
 */