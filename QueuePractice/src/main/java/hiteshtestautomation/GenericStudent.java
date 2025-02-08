package hiteshtestautomation;

public class GenericStudent implements GenericIStudent<String, Double, Double>{
    private String name;
    private double grade;
    private double gpa;

    public GenericStudent(String name, double grade, double gpa) {
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getGrade() {
        return grade;
    }

    @Override
    public Double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return name + " (GPA: " + gpa + ")";
    }
}

