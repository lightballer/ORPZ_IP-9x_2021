package ІП_94._03_Бокій_Артем_Едуардович.first_pack.lab4;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // 9403
        // C11 = 9403 % 11 = 9
        Student[] students = {
            new Student("Ivan", "Ivanov", 2002, "KNU", 90.5),
            new Student("Artem", "Bokii", 2001, "KPI", 93),
            new Student("Gordon", "Clark", 1948, "MIT", 100),
            new Student("Gordon", "Shumway", 1820, "MNU", 60)
        };

        printStudents(students);

        Arrays.sort(students, new NameComparator().thenComparing(new GradePointAverageComparator()));

        System.out.println();
        printStudents(students);
    }

    static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
