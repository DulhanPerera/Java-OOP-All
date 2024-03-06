/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class ConstructorOverloading {
    // Overloaded Constructors - Multiple constructors within a classwith the same name, ut different parameters 
    //                             name + parameters = signature
    
    public static void main(String[] args){
        
        Pizza pizza1 = new Pizza("Thicc Crust Bread");
        Pizza pizza2 = new Pizza("Thicc Crust", "Tomato Sauce");
        Pizza pizza3 = new Pizza("Thicc Crust", "Tomato", "Cheese");
        Pizza pizza4 = new Pizza("Thicc Crust", "Tomato", "Mozzerella", "Pepperoni");

        System.out.println("Here are the ingrediants for your pizza 1: ");
        System.out.println(pizza1.bread);
        System.out.println();
        
        System.out.println("Here are the ingrediants for your pizza 2: ");
        System.out.println(pizza2.bread);
        System.out.println(pizza2.cheese);
        System.out.println();
        
        System.out.println("Here are the ingrediants for your pizza 3: ");
        System.out.println(pizza3.bread);
        System.out.println(pizza3.cheese);
        System.out.println(pizza3.suace);
        System.out.println();
        
        System.out.println("Here are the ingrediants for your pizza 4: ");
        System.out.println(pizza4.bread);
        System.out.println(pizza4.cheese);
        System.out.println(pizza4.suace);
        System.out.println(pizza4.toppings);
        
    }
    
}
