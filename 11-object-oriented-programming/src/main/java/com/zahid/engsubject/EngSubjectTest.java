package com.zahid.engsubject;

public class EngSubjectTest {
    public static void main(String[] args) {
        EngSubject[] subjects = new EngSubject[3]; // alike array of pointers

        subjects[0] = new EngSubject(203, "Data Structures", 100, 95);
        subjects[1] = new EngSubject(205, "Digital Logic Design", 100, 92);
        subjects[2] = new EngSubject(207, "Algorithms", 100, 97);

        System.out.println(subjects[0]);
        System.out.println(subjects[1]);
        System.out.println(subjects[2]);
        System.out.println();
        
        for(EngSubject sub: subjects) {
            System.out.println(sub);
        }
    }
}
