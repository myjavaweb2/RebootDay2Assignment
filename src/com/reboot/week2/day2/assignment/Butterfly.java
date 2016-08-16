package com.reboot.week2.day2.assignment;

public class Butterfly extends Animal {

	private boolean hasmultiColorPatterns = false;

	public Butterfly(String name, String type, int legs, boolean haveBackbone, boolean canFly, boolean isSleeping,
			float height, float weight, boolean hasmultiColorPatterns) {
		super(name, type, legs, haveBackbone, canFly, isSleeping, height, weight);
		this.hasmultiColorPatterns = hasmultiColorPatterns;
	}

	public boolean isHasmultiColorPatterns() {
		return hasmultiColorPatterns;
	}

	public void setHasmultiColorPatterns(boolean hasmultiColorPatterns) {
		this.hasmultiColorPatterns = hasmultiColorPatterns;
	}

	@Override
	public String toString() {
		return "Today at the zoo, I saw a " + name + ". It's a/an " + type + ", \nwith  " + legs
				+ " legs. It has a height of " + height + " feet and weights " + weight + " pound. \nIt's " + haveBackbone
				+ " that it have backbone and it's " + hasmultiColorPatterns
				+ " that it have multi \ncolor pattern feathers. It's also " + canFly
				+ " that it can fly. While I \nwas at the zoo, it's " + isSleeping + " that it as sleeping.";
	}

}
