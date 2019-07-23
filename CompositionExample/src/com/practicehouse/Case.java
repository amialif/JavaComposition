package com.practicehouse;

public class Case {

	private String model;
	private String manufacturer;
	private Dimenssion dimenssion;
	private String powerSupply;

	public Case(String model, String manufacturer, Dimenssion dimenssion, String powerSupply) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.dimenssion = dimenssion;
		this.powerSupply = powerSupply;
	}

	public void pressPowerButton() {
		System.out.println("Power Button Pressed");
	}

}
