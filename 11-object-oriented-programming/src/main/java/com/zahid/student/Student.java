package com.zahid.student;

import java.util.Arrays;

public class Student {
    private int rollNo;
    private String name;
    private String department;
    private int[] marks;

    public Student() {
    }

    public Student(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double getAverage() {
        int sum = 0;
        for(int i=0; i<marks.length; i++) {
            sum += marks[i];
        }

        double average = sum / marks.length;
        
        return average;
    }

    public String getGrade() {
        double average = this.getAverage();

        if(average >= 80 && average <= 100)
            return "A+";
        else if(average >= 70 && average < 80)
            return "A";
        else if(average >= 60 && average < 70)
            return "A-";
        else if(average >= 50 && average < 60)
            return "B";
        else if(average >= 40 && average < 50)
            return "C";
        else if(average >= 33 && average < 40)
            return "D";
        else if(average >= 0 && average < 33)
            return "F";
        return "";
    }

    @Override
    public String toString() {
        return "Student [department=" + department + ", marks=" + Arrays.toString(marks) + ", name=" + name
                + ", rollNo=" + rollNo + "]";
    }

    
}
