package com.practicehouse;

public class Motherboard {

	private String model;
	private String manufacturer;
	private String biosName;
	private int numOfSlots;
	private String version;

	public Motherboard(String model, String manufacturer, String biosName, int numOfSlots, String version) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.biosName = biosName;
		this.numOfSlots = numOfSlots;
		this.version = version;
	}

	public void powerUp(String programName) {
		System.out.println("Motherboar.powerUp() -> loading the " + programName);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public String getBiosName() {
		return biosName;
	}

	public int getNumOfSlots() {
		return numOfSlots;
	}

	public String getVersion() {
		return version;
	}

}
