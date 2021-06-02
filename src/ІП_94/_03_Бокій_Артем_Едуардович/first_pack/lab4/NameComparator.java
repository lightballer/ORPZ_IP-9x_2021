package ІП_94._03_Бокій_Артем_Едуардович.first_pack.lab4;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
