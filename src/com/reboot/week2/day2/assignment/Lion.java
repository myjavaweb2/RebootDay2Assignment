package com.reboot.week2.day2.assignment;

public class Lion extends Animal {
	
	private String lionsName = null;
	private String gender = null;
	
	public Lion(String name, String type, int legs, boolean haveBackbone, boolean canFly, boolean isSleeping,
			float height, float weight, String lionsName, String gender) {
		super(name, type, legs, haveBackbone, canFly, isSleeping, height, weight);
		this.lionsName = lionsName;
		this.gender = gender;
	}
	public String getLionsName() {
		return lionsName;
	}
	public void setLionsName(String lionsName) {
		this.lionsName = lionsName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Today at the zoo, I saw a " + name + ". It's a/an " + type + ". It's name is " + lionsName
				+ " \nand it's a " + gender + ". It has " + legs + " legs. It also has a height of " + height
				+ " feet and weights \n" + weight + " pound. It's " + haveBackbone + " that it have backbone and it's " + canFly
				+ " that it can fly. \nWhile I was at the zoo, it's " + isSleeping + " that it as sleeping.";
	}
	
}
