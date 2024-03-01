/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class Constructors {
    public static void main(String[] args) {
        
        Human human1 = new Human("Dulhan", 22, 100.00);
        Human human2 = new Human("Risindu", 18, 110.00);
        
        System.out.println(human1.name);
        System.out.println(human1.age);
        System.out.println(human1.weight);
        
        System.out.println();
        
        System.out.println(human2.name);
        System.out.println(human2.age);
        System.out.println(human2.weight);
        
        System.out.println();
        
        human2.eat();
        human1.drink();
    }
    
}
