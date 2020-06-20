package Lesson8;


public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student name is: " + name;
    }


}
