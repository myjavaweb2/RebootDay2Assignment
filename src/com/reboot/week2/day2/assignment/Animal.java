package com.reboot.week2.day2.assignment;

public class Animal {
	
	protected String name = null;
	protected String type = null;
	protected int legs = 0;
	protected boolean haveBackbone = false;
	protected boolean canFly = false;
	protected boolean isSleeping = false;
	protected float height = 0.0f;
	protected float weight = 0.0f;
	
	public Animal(String name, String type, int legs, boolean haveBackbone, boolean canFly, boolean isSleeping,
			float height, float weight) {
		this.name = name;
		this.type = type;
		this.legs = legs;
		this.haveBackbone = haveBackbone;
		this.canFly = canFly;
		this.isSleeping = isSleeping;
		this.height = height;
		this.weight = weight;
	}
	public Animal(String name2, String type2, int legs2, float height2, float weight2) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public boolean isHaveBackbone() {
		return haveBackbone;
	}
	public void setHaveBackbone(boolean haveBackbone) {
		this.haveBackbone = haveBackbone;
	}
	public boolean isCanFly() {
		return canFly;
	}
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	public boolean isSleeping() {
		return isSleeping;
	}
	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
}
