package com.zahid.student;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Zahid", "CSE");
        s1.setMarks(new int[]{93, 82, 75, 81, 66});
        System.out.println(s1);
        System.out.printf("Average = %.2f\n", s1.getAverage());
        System.out.println("Grade = " + s1.getGrade());
        System.out.println();

        Student s2 = new Student(102, "Jewel", "EEE");
        s2.setMarks(new int[]{42, 62, 25, 34, 46});
        System.out.println(s2);
        System.out.printf("Average = %.2f\n", s2.getAverage());
        System.out.println("Grade = " + s2.getGrade());
        System.out.println();

        Student s3 = new Student(103, "Robi", "ME");
        s3.setMarks(new int[]{25, 34, 23, 31, 37});
        System.out.println(s3);
        System.out.printf("Average = %.2f\n", s3.getAverage());
        System.out.println("Grade = " + s3.getGrade());
        System.out.println();
    }
}
