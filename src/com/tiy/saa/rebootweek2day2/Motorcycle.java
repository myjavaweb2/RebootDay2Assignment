package com.tiy.saa.rebootweek2day2;

public class Motorcycle extends Vehicle {
	
	private boolean sidecar = false;

	public Motorcycle(boolean running, String color, String condition, boolean fueledUp, int numberOfSeats, int wheels,
			boolean sidecar) {
		super(running, color, condition, fueledUp, numberOfSeats, wheels);
		this.sidecar = sidecar;
	}

	public boolean isSidecar() {
		return sidecar;
	}

	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}

	public void doWeHaveASidecar(){
		if(sidecar){
			wheels += 1;
			numberOfSeats += 1;
		}
	}
	

}
