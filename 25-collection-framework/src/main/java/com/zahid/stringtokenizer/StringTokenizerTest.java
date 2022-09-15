package com.zahid.stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		
//		String data="name=Zahid;age=30;dept=CSE;university=BUET;address=Dhaka";
//		String data="name=Zahid\nage=30\ndept=CSE\nuniversity=BUET\naddress=Dhaka";
		String data="name=Zahid age=30 ndept=CSE nuniversity=BUET naddress=Dhaka";
		
		System.out.println(data);
		
//		StringTokenizer stk = new StringTokenizer(data, "=;");
//		StringTokenizer stk = new StringTokenizer(data, "=\n");
//		StringTokenizer stk = new StringTokenizer(data, "=");
		StringTokenizer stk = new StringTokenizer(data, "= ");
		
		System.out.println(stk);
		System.out.println();
		
		String str;
		
		while(stk.hasMoreTokens()) {
			str = stk.nextToken();
			System.out.println(str);
		}

	}

}
