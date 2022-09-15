package com.zahid.cuboid;

public class CuboidTest {

	public static void main(String[] args) {
		Cuboid c1 = new Cuboid();
		System.out.println(c1.volume());
		
		Cuboid c2 = new Cuboid(4, 9, 2);
		System.out.println(c2.volume());
	}

}
