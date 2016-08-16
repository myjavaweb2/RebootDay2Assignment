package com.reboot.week2.day2.assignment;

public class Horse extends Animal {

	private String horseName = null;
	private boolean hasMultiColors = false;
	private boolean wasGallopingAround = false;

	public Horse(String name, String type, int legs, boolean haveBackbone, boolean canFly, boolean isSleeping,
			float height, float weight, String horseName, boolean hasMultiColors, boolean wasGallopingAround) {
		super(name, type, legs, haveBackbone, canFly, isSleeping, height, weight);
		this.horseName = horseName;
		this.hasMultiColors = hasMultiColors;
		this.wasGallopingAround = wasGallopingAround;
	}

	public String getHorseName() {
		return horseName;
	}

	public void setHorseName(String horseName) {
		this.horseName = horseName;
	}

	public boolean isHasMultiColors() {
		return hasMultiColors;
	}

	public void setHasMultiColors(boolean hasMultiColors) {
		this.hasMultiColors = hasMultiColors;
	}

	public boolean isWasGallopingAround() {
		return wasGallopingAround;
	}

	public void setWasGallopingAround(boolean wasGallopingAround) {
		this.wasGallopingAround = wasGallopingAround;
	}

	@Override
	public String toString() {
		return "Today at the zoo, I saw a " + name + ". It's a/an " + type + ". It's name is " + horseName
				+ ". \nIt has " + legs + " legs. It also has a height of " + height + " feet and weights " + weight
				+ " pounds. \nIt's " + hasMultiColors + " that it's skin has multi colors and it's " + haveBackbone
				+ " that it have backbone. \nIt's also " + wasGallopingAround
				+ " that it was galloping around and it's also " + canFly
				+ " that it can fly. \nWhile I was at the zoo, it's " + isSleeping + " that it as sleeping.";
	}

}
