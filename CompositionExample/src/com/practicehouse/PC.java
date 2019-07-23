package com.practicehouse;

public class PC {

	private Monitor theMonitor;
	private Motherboard theMotherBoard;
	private Case theCase;

	public PC(Monitor theMonitor, Motherboard theMotherBoard, Case theCase) {
		super();
		this.theMonitor = theMonitor;
		this.theMotherBoard = theMotherBoard;
		this.theCase = theCase;
	}

	private void loadPC(String programName) {
		theCase.pressPowerButton();
		theMotherBoard.powerUp(programName);
	}

	public void StartPC(String programName, int x, int y, String color) {
		loadPC(programName);
		theMonitor.drawPixelAt(x, y, color);
	}

	public Monitor getTheMonitor() {
		return theMonitor;
	}

	public Motherboard getTheMotherBoard() {
		return theMotherBoard;
	}

	public Case getTheCase() {
		return theCase;
	}

}
