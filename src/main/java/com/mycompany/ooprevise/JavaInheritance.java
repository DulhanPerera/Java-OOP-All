package com.mycompany.ooprevise;

public class JavaInheritance {
	public static void main(String[] args) {
		// Inheritance = the process where one class acquires, the attributes and methods of another class.
		
		CarInherit car = new CarInherit();
		Bicycle bicycle = new Bicycle();
		
		car.stop();
		bicycle.go();
		
		System.out.println();
		
		System.out.println("Your speed is " + car.speed + " km/h");
		
		System.out.println();
		
		System.out.println(bicycle.wheels);
		System.out.println(car.wheels);
	}

}
