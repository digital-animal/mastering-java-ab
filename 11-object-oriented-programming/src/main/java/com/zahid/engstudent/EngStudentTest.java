package com.zahid.engstudent;

import java.util.Arrays;

import com.zahid.engsubject.EngSubject;

public class EngStudentTest {
    public static void main(String[] args) {
        // first process ..a bit messy and hardcoded
        /*
        EngStudent s1 = new EngStudent(101, "Zahidul Islam", "CSE");

        EngSubject[] registeredSubjects = new EngSubject[5];
        registeredSubjects[0] = new EngSubject(203, "Data Structures", 100, 89);
        registeredSubjects[1] = new EngSubject(205, "Digital Logic Design", 100, 67);
        registeredSubjects[2] = new EngSubject(207, "Algorithms", 100, 82);
        registeredSubjects[3] = new EngSubject(201, "Object Oriented Programming", 100, 86);
        registeredSubjects[4] = new EngSubject(263, "Microelectric Circuits", 100, 72);

        s1.setRegisteredSubjects(registeredSubjects);

        // System.out.println(s1);
        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
        System.out.println(s1.getDepartment());
        System.out.println(Arrays.toString(s1.getRegisteredSubjects()));
        */

        // second process ..much cleaner
        EngStudent s1 = new EngStudent(101, "Zahidul Islam", "CSE");

        EngSubject sub1 = new EngSubject(203, "Data Structures", 100, 89);
        EngSubject sub2 = new EngSubject(205, "Digital Logic Design", 100, 67);
        EngSubject sub3 = new EngSubject(207, "Algorithms", 100, 82);
        EngSubject sub4 = new EngSubject(201, "Object Oriented Programming", 100, 86);
        EngSubject sub5 = new EngSubject(263, "Microelectric Circuits", 100, 72);
        EngSubject[] registeredSubjects = {sub1, sub2, sub3, sub4, sub5};

        s1.setRegisteredSubjects(registeredSubjects);

        // System.out.println(s1);
        System.out.println(s1.getRollNo());
        System.out.println(s1.getName());
        System.out.println(s1.getDepartment());
        System.out.println(Arrays.toString(s1.getRegisteredSubjects()));

    }
}
