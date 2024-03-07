package com.mycompany.ooprevise;

import java.util.Scanner;

public class DynamicPolymorphism {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Animals animal;
		
		System.out.println("What animal do you want? (1 = Dog | 2 = Cat): ");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dogs();
			animal.speak();
//			System.out.println("");
		}
		else {
			animal = new Cats();
			animal.speak();
//			System.out.println("");
		}

	}

}
