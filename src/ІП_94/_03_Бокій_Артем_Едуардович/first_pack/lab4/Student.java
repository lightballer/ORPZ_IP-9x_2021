package ІП_94._03_Бокій_Артем_Едуардович.first_pack.lab4;

public class Student {
    private String name;
    private String surname;
    private int birthYear;
    private String university;
    private double gradePointAverage;

    Student(String name, String surname, int birthYear, String university, double gradePointAverage) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.university = university;
        this.gradePointAverage = gradePointAverage;
    }

    @Override
    public String toString() {
        return name + " " +
                surname + " " +
                birthYear + " " +
                university + " " +
                gradePointAverage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public double getGradePointAverage() {
        return gradePointAverage;
    }

    public void setGradePointAverage(double gradePointAverage) {
        this.gradePointAverage = gradePointAverage;
    }
}
