/**
 * 
 */
package com.mycompany.ooprevise;

/**
 * 
 */
public class Fish implements Prey, Predetor{

	@Override
	public void hunt() {
		System.out.println("The fish is HUNTING smaller fish!");
		
	}

	@Override
	public void flee() {
		System.out.println("The fish is HUNTINGED by larger fish!");
		
	}

}
