package com.reboot.week2.day2.assignment;

public class Snake extends Animal {

	private boolean isPoisonous = false;
	private float length = 0.0f;

	public Snake(String name, String type, int legs, boolean haveBackbone, boolean canFly, boolean isSleeping,
			float height, float weight, boolean isPoisonous, float length) {
		super(name, type, legs, haveBackbone, canFly, isSleeping, height, weight);
		this.isPoisonous = isPoisonous;
		this.length = length;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
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
				+ " legs. It has a height of " + height + " feet and weights " + weight
				+ " pound. \nIt has a length of " + length + " feet. It's " + haveBackbone
				+ " that it have backbone and \nit's " + canFly + " that it can fly. It's also " + isPoisonous
				+ " it's poosonous. While \nI was at the zoo, it's " + isSleeping + " that it as sleeping.";
	}

}
