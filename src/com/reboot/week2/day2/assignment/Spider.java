package com.reboot.week2.day2.assignment;

public class Spider extends Animal {

	private boolean makeSpiderWebs = false;
	private boolean isPoisonous = false;

	public Spider(String name, String type, int legs, boolean haveBackbone, boolean canFly, boolean isSleeping,
			float height, float weight, boolean makeSpiderWebs, boolean isPoisonous) {
		super(name, type, legs, haveBackbone, canFly, isSleeping, height, weight);
		this.makeSpiderWebs = makeSpiderWebs;
		this.isPoisonous = isPoisonous;
	}

	public boolean isMakeSpiderWebs() {
		return makeSpiderWebs;
	}

	public void setMakeSpiderWebs(boolean makeSpiderWebs) {
		this.makeSpiderWebs = makeSpiderWebs;
	}

	public boolean isPoisonous() {
		return isPoisonous;
	}

	public void setPoisonous(boolean isPoisonous) {
		this.isPoisonous = isPoisonous;
	}

	@Override
	public String toString() {
		return "Today at the zoo, I saw a " + name + ". It's a/an " + type + ", \nwith  " + legs
				+ " legs. It has a height of " + height + " feet and weights " + weight + " pound. \nIt's "
				+ haveBackbone + " that it have backbone and it's " + canFly + " that it can fly. \nIt's also "
				+ makeSpiderWebs + " that it makes spider webs and it's " + isPoisonous
				+ " it's poosonous. \nWhile I was at the zoo, it's " + isSleeping + " that it as sleeping.";
	}

}
