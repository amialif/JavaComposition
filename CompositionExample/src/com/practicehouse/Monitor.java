package com.practicehouse;

public class Monitor {

	private String model;
	private String manufacturer;
	private Resolution NativaResolution;

	public Monitor(String model, String manufacturer, Resolution nativaResolution) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		NativaResolution = nativaResolution;
	}

	public void drawPixelAt(int x, int y, String color) {
		System.out.println(
				"Monitor.drawPixelAt() -> Drawing the Logo in " + x + " and " + y + " with the color " + color);
	}

	public String getModel() {
		return model;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public Resolution getNativaResolution() {
		return NativaResolution;
	}

}
