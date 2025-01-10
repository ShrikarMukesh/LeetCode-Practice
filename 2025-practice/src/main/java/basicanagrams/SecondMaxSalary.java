package main.java.basicanagrams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class SecondMaxSalary {
    public static void main(String[] args) {
        // Sample list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 45, 80000),
                new Employee("Bob", 50, 70000),
                new Employee("Charlie", 35, 90000),
                new Employee("David", 42, 75000),
                new Employee("Eve", 46, 80000)
        );


        Optional<Double> secondMaxSalary = employees.stream()
                .filter(emp -> emp.getAge() > 40) // Filter employees with age > 40
                .map(Employee::getSalary)        // Extract salaries
                .distinct()                      // Remove duplicate salaries
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1)                         // Skip the first (highest) salary
                .findFirst();                    // Get the second highest

        secondMaxSalary.ifPresentOrElse(
                salary -> System.out.println("Second highest salary: " + salary),
                () -> System.out.println("No second highest salary found.")
        );
    }
}
