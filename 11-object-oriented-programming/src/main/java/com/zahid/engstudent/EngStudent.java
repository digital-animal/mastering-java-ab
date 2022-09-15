package com.zahid.engstudent;

import java.util.Arrays;

import com.zahid.engsubject.EngSubject;

public class EngStudent {
    private int rollNo;
    private String name;
    private String department;
    private EngSubject[] registeredSubjects;

    public EngStudent() {
    }
 
    public EngStudent(int rollNo, String name, String department) {
        this.rollNo = rollNo;
        this.name = name;
        this.department = department;
    }
    
    public int getRollNo() {
        return rollNo;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public EngSubject[] getRegisteredSubjects() {
        return registeredSubjects;
    }
    
    public void setRegisteredSubjects(EngSubject[] registeredSubjects) {
        this.registeredSubjects = registeredSubjects;
    }


	@Override
	public String toString() {
		return "EngStudent [department=" + department + ", name=" + name + ", registeredSubjects="
				+ Arrays.toString(registeredSubjects) + ", rollNo=" + rollNo + "]";
	}
    
    
}
