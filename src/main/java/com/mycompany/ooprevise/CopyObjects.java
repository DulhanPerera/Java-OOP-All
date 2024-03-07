/**
 * 
 */
package com.mycompany.ooprevise;

/**
 * 
 */
public class CopyObjects {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Carr car1 = new Carr("Chevrolet","Camaro",2021);
		//Carr car2 = new Carr("Ford","Mustang",2022);
		
		//car2.copy(car1);
		
		Carr car2 = new Carr(car1);
		
		System.out.println(car1);
		System.out.println(car2);
		System.out.println();
		System.out.println(car1.getMake());
		System.out.println(car1.getModel());
		System.out.println(car1.getYear());
		System.out.println();
		System.out.println(car2.getMake());
		System.out.println(car2.getModel());
		System.out.println(car2.getYear());	
	}

}
