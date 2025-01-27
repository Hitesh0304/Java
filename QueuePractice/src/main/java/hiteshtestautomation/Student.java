package hiteshtestautomation;

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
}
