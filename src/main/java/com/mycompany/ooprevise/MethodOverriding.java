/**
 * 
 */
package com.mycompany.ooprevise;

/**
 * 
 */
public class MethodOverriding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Method Overriding  - Declaring a method in a sub class.
		// 						which is already present in the parent class.
		//						Done that so child class can give its own implementation.
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		
		dog.speak();
		animal.speak();

	}

}
