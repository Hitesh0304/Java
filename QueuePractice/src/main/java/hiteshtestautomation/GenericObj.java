package hiteshtestautomation;

import java.util.Comparator;

public class GenericObj implements GenericIStudent<String, Double, Double>{
    private String name;
    private double grade;
    private double gpa;

    public GenericObj(String name, double grade, double gpa) {
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

class GenericGpaComparator implements Comparator<GenericObj> {
    @Override
    public int compare(GenericObj o1, GenericObj o2) {
        return Double.compare(o1.getGpa(), o2.getGpa());
    }
}
