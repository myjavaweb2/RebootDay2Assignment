package com.reboot.week2.day2.assignment;

public class Bee extends Animal {
	
	private boolean canString = false;

	public Bee(String name, String type, int legs, boolean haveBackbone, boolean canFly, boolean isSleeping,
			float height, float weight, boolean canString) {
		super(name, type, legs, haveBackbone, canFly, isSleeping, height, weight);
		this.canString = canString;
	}

	public boolean isCanString() {
		return canString;
	}

	public void setCanString(boolean canString) {
		this.canString = canString;
	}

	@Override
	public String toString() {
		return "Today at the zoo, I saw a " + name + ". Its a/an " + type + ", with " + legs + 
				 " legs. \nIt has a height of " + height + " feet and weights " + weight + 
				" pound. It's " + haveBackbone + " that \nit have backbone and it's " + canFly +  
				" that it can fly. It's also " + canString + " that \nit can string. " +
				"While I was at the zone, it's " + isSleeping + " that it was sleeping.";				 
	}
	
}
