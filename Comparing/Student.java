package Comparing;

public class Student implements Comparable<Student> {
    // private fields
    private int id;
    private String name;
    private float marks;

    // constructor
    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // getters
    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    Float getMarks() {
        return marks;
    }

    // override toString() method of Object class
    public String toString() {
        return "Student[" + "id-" + id + ", name-" + name + ", marks-" + marks + "]";
    }

    public int compareTo(Student other) {
    return Float.compare(this.marks, other.marks);// 0 if euqal, <0 is a<b, >0 a>b

    }


   

}
