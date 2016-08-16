package com.reboot.week2.day2.assignment;

public class Shark extends Animal {
	
	private float length = 0.0f;

	public Shark(String name, String type, int legs, boolean haveBackbone, boolean canFly, boolean isSleeping,
			float height, float weight, float length) {
		super(name, type, legs, haveBackbone, canFly, isSleeping, height, weight);
		this.length = length;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Today at the zoo, I saw a " + name + ". It's a/an " + type + ", \nwith  " + legs
				+ " legs. It has a height of " + height + " feet and weights " + weight + " pound. \nIt has a length of " + length
				+ " feet. It's " + haveBackbone + " that it have backbone and it's " + canFly
				+ " \nthat it can fly. While I was at the zoo, it's " + isSleeping + " that it as sleeping.";
	}
	
}
