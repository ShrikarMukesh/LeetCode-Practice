
package main.java.java8;


import java.util.*;
import java.util.stream.Collectors;

class Employee {

    private int id;
    private String name;
    private int salary;
    private String dept;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public Employee(String dept, int salary, String name, int id) {
        this.dept = dept;
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public Employee(){}

}
public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee emp1 = new Employee("dev",10000, "Shrikar",1);
        Employee emp2 = new Employee("Test",20000, "Dinesh",1);
        Employee emp3 = new Employee("dev",12000, "Anil",1);
        Employee emp4 = new Employee("Test",10000, "Rohan",1);

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        System.out.println(employeeList);


        Map<String, Double> avgSalaryByDept = employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println(avgSalaryByDept);

        Optional<Integer> secondMaxSalary = employeeList.stream()
                .map(Employee::getSalary) // Extract salaries
                .distinct()               // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1)                  // Skip the first (highest) salary
                .findFirst();             // Get the second salary

        System.out.println(secondMaxSalary);


    }
}
