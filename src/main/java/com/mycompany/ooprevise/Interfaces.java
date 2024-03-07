/**
 * 
 */
package com.mycompany.ooprevise;

/**
 * 
 */
public class Interfaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Interface - a template that can be applied to a class.
		// similar to inheritance, but specifies what a class has/must do.
		//classes can more than one interface, inheritance is limited to 1 super class
		
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		Fish fish = new Fish();
		
		rabbit.flee();
		hawk.hunt();
		fish.hunt();
		fish.flee();

	}

}
