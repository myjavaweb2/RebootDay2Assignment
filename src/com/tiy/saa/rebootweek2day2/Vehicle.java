package com.tiy.saa.rebootweek2day2;

public class Vehicle {
	// Every object have state and behavior
	// State of Vehicle
	protected boolean running = false;
	protected String color = null;
	protected String condition = null;
	protected boolean fueledUp = false;
	protected int numberOfSeats = 0;
	protected int wheels = 0;

	public Vehicle(boolean running, String color, String condition, boolean fueledUp, int numberOfSeats, int wheels) {
		this.running = running;
		this.color = color;
		this.condition = condition;
		this.fueledUp = fueledUp;
		this.numberOfSeats = numberOfSeats;
		this.wheels = wheels;
	}

	public boolean isRunning() {
		return running;
	}

	public void setRunning(boolean running) {
		this.running = running;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public boolean isFueledUp() {
		return fueledUp;
	}

	public void setFueledUp(boolean fueledUp) {
		this.fueledUp = fueledUp;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	// Behavior
	protected void turnOn() {
		running = true;
	}
}
