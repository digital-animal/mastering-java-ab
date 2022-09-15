package com.zahid.enumexample;

enum Dept {
	CSE, EEE, IPE, ME, CE;
}

public class EnumTest {

	public static void main(String[] args) {
		
		Dept d1 = Dept.CSE;
		Dept d2 = Dept.EEE;
		Dept d3 = Dept.IPE;
		Dept d4 = Dept.ME;
		Dept d5 = Dept.CE;
		System.out.println(d1.ordinal());
		System.out.println(d2.ordinal());
		System.out.println(d3.ordinal());
		System.out.println(d4.ordinal());
		System.out.println(d5.ordinal());
		
//		System.out.println(Dept.CSE);
//		System.out.println(Dept.valueOf("CSE"));
		
		Dept deptList[] = Dept.values();
		
		for(Dept dept: deptList) {
			System.out.println(dept);
		}

	}

}
