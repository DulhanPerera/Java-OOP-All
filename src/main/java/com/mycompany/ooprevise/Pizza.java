/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class Pizza {
    
    String bread;
    String suace;
    String cheese;
    String toppings;
    
    Pizza(String bread){
        this.bread = bread;
    }
    
    Pizza(String Bread, String sauce){
        this.bread = bread;
        this.suace = sauce;
    }
    
    Pizza(String bread, String sauce, String cheese){
        this.bread = bread; 
        this.suace = sauce;
        this.cheese = cheese;
    }
    
    Pizza(String bread, String sauce, String cheese, String toppings){
        this.bread = bread;
        this.suace = suace;
        this.cheese = cheese;
        this.toppings = toppings;
    }
}
