package ІП_94._03_Бокій_Артем_Едуардович.first_pack.lab4;

import java.util.Comparator;

public class GradePointAverageComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int)(o2.getGradePointAverage() - o1.getGradePointAverage());
    }
}
