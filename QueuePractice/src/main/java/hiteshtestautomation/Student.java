package hiteshtestautomation;

import java.util.Comparator;

public class Student implements IStudent{
    private String name;
    private double grade;
    private double gpa;

    public Student(String name, double grade, double gpa) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getGrade() {
        return grade;
    }

    @Override
    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }
}

class GpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Double.compare(s1.getGpa(), s2.getGpa());
    }
}
