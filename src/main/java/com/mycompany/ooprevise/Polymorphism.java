package com.mycompany.ooprevise;

public class Polymorphism {

	public static void main(String[] args) {
		// polymorphism = 	Greek word for poly-"many", morph-"form"
		//					The ability of an object to identify as more than one type

		Carss car = new Carss();
		Bicycless bicycle = new Bicycless();
		Boat boat = new Boat();
		
		Vehicless[] racers = {car, bicycle, boat};
		
		for(Vehicless x: racers) {
			x.go();
		}
		
	}

}
