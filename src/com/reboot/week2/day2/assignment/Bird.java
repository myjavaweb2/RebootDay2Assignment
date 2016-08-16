package com.reboot.week2.day2.assignment;

public class Bird extends Animal {

	private boolean canTalk = false;
	private boolean haveFeathers = false;

	public Bird(String name, String type, int legs, boolean haveBackbone, boolean canFly, boolean isSleeping,
			float height, float weight, boolean canTalk, boolean haveFeathers) {
		super(name, type, legs, haveBackbone, canFly, isSleeping, height, weight);
		this.canTalk = canTalk;
		this.haveFeathers = haveFeathers;
	}

	public boolean isCanTalk() {
		return canTalk;
	}

	public void setCanTalk(boolean canTalk) {
		this.canTalk = canTalk;
	}

	public boolean isHaveFeathers() {
		return haveFeathers;
	}

	public void setHaveFeathers(boolean haveFeathers) {
		this.haveFeathers = haveFeathers;
	}

	@Override
	public String toString() {
		return "Today at the zoo, I saw a " + name + ". It's a/an " + type + ", with " + legs
				+ " legs. \nIt has a height of " + height + " feet and weights " + weight + " pound. It's " + haveBackbone
				+ " that \nit have backbone and it's " + haveFeathers + " that it have feathers. It's also " + canFly
				+ " \nthat it can fly and it's " + canTalk + " that it can talk. While I was at the zoo, \nit's "
				+ isSleeping + " that it was sleeping.";
	}

}
