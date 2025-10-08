import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + salary;
    }
}

public class SortEmployees {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Himani", 55000));
        employees.add(new Employee(102, "Ravi", 48000));
        employees.add(new Employee(103, "Karan", 60000));

        System.out.println("Before Sorting:");
        employees.forEach(System.out::println);

        employees.sort((e1, e2) -> Double.compare(e1.salary, e2.salary));

        System.out.println("\nAfter Sorting by Salary:");
        employees.forEach(System.out::println);
    }
}
