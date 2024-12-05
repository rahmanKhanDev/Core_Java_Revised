package Comparing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student sonu = new Student(101, "Mirnal", 77.87f);
        Student monu = new Student(102, "Khusi", 77.87f);
        Student rahman = new Student(103, "Rahman", 70.78f);

        // ArrayList created
        ArrayList<Student> students = new ArrayList<>();
        // added to list
        students.add(sonu);
        students.add(monu);
        students.add(rahman);

        // invoke toString()- print Students
        for (Student student : students) {

            System.out.println(student.toString());
        }
        System.out.println();
        // compare based on marks
        int comparedValue = sonu.compareTo(monu);

        if (comparedValue == 0) {
            System.out.println(sonu.getName() + " and " + monu.getName() + " have same marks");
            System.out.println(sonu.getName() + " marks-" + sonu.getMarks());
            System.out.println(monu.getName() + " marks-" + monu.getMarks());
        } else if (comparedValue > 0) {
            System.out.println(sonu.getName() + " has higher marks than " + monu.getName());
            System.out.println(sonu.getName() + " marks-" + sonu.getMarks());
            System.out.println(monu.getName() + " marks-" + monu.getMarks());
        } else {
            System.out.println(monu.getName() + " has higher marks than " + sonu.getName());
            System.out.println(sonu.getName() + " marks-" + sonu.getMarks());
            System.out.println(monu.getName() + " marks-" + monu.getMarks());
        }
        System.out.println();
        float comparedValue2 = rahman.compareTo(monu);

        if (comparedValue2 == 0) {
            System.out.println(rahman.getName() + " and " + monu.getName() + " have same marks");
            System.out.println(rahman.getName() + " marks-" + rahman.getMarks());
            System.out.println(monu.getName() + " marks-" + monu.getMarks());
        } else if (comparedValue2 > 0) {
            System.out.println(rahman.getName() + " has higher marks than " + monu.getName());
            System.out.println(rahman.getName() + " marks-" + rahman.getMarks());
            System.out.println(monu.getName() + " marks-" + monu.getMarks());
        } else {
            System.out.println(monu.getName() + " has higher marks than " + rahman.getName());
            System.out.println(rahman.getName() + " marks-" + rahman.getMarks());
            System.out.println(monu.getName() + " marks-" + monu.getMarks());
        }
    }

}
