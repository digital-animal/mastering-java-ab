package com.zahid.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {
	
	@Override
	public int compare(Integer obj1, Integer obj2) {
		
		if(obj1 < obj2) return 1;
		else if(obj1 > obj2) return -1;
		return 0;

	}

}
