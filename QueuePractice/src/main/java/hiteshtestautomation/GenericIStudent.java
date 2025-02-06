package hiteshtestautomation;

public interface GenericIStudent<Name, Grade, Gpa> {

    Name getName();
    Grade getGrade();
    Gpa getGpa();
}
