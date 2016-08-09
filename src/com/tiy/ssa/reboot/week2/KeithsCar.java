package com.tiy.ssa.reboot.week2;

public class KeithsCar {
	private int windows = 8;
	private int door = 5;
	private boolean runs = true;
	private String make = "Honda";
	private String model = "CRV";
	private String color = "Red";
	private boolean currentlyRunning = false;
	
	public KeithsCar(int windows, int door, boolean runs, String make, String model, String color,
			boolean currentlyRunning) {
		super();
		this.windows = windows;
		this.door = door;
		this.runs = runs;
		this.make = make;
		this.model = model;
		this.color = color;
		this.currentlyRunning = currentlyRunning;
	}

	public KeithsCar() 
	{
		
	}

	public int getWindows() {
		return windows;
	}

	public int getDoor() {
		return door;
	}

	public boolean isRuns() {
		return runs;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public boolean isCurrentlyRunning() {
		return currentlyRunning;
	}
	
	
	
	
	

}
