import java.util.*;
import java.util.stream.*;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + " " + marks;
    }
}

public class StreamStudents {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Himani", 85),
            new Student("Karan", 67),
            new Student("Ravi", 92),
            new Student("Tina", 75)
        );

        System.out.println("Students Scoring Above 70 Sorted by Marks:");
        students.stream()
                .filter(s -> s.marks > 70)
                .sorted((s1, s2) -> Integer.compare(s1.marks, s2.marks))
                .forEach(System.out::println);
    }
}
