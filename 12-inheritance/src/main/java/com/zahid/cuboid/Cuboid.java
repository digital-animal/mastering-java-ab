package com.zahid.cuboid;

public class Cuboid extends Rectangle {
	public int height;

	public Cuboid() {
		this.height = 0;
	}

	public Cuboid(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
	
	public int volume() {
		return length*breadth*height;
	}
	
}
