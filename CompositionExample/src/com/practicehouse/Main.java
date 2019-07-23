package com.practicehouse;

public class Main {

	public static void main(String[] args) {
		
		Monitor theMonitor = new Monitor("Acer27", "Acer", new Resolution(2540, 1280));
		Motherboard theMotherBoard = new Motherboard("IntelD33", "Intel", "3300Bbus", 4, "4.22V");
		Case theCase = new Case("CSM", "acer", new Dimenssion(12, 13, 5), "240V.DC");
		
		PC thePc = new PC(theMonitor, theMotherBoard, theCase);
		
		// Can use directly like this if your functions are public
		
		//	thePc.getTheCase().pressPowerButton();
		//	thePc.getTheMotherBoard().powerUp("Windwos X");
		//	thePc.getTheMonitor().drawPixelAt(120, 25, "Yellow");
		
		// we want to use the best practice so implements like this
		
		thePc.StartPC("Windows X", 120, 24, "Red");

	}

}
