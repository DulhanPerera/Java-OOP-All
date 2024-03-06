/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class Car {
    
    String make = "Toyota";
    String model = "Supra";
    int year = 2011;
    String color = "White";
    double price = 30000.00;
    
    void drive(){
        System.out.println("You are driving the car!");
    }
    
    void brake(){
        System.out.println("You step on the brake!");
    }
    
    @Override
    public String toString(){
        return make+"\t"+model+"\t"+year+"\t"+color;
    }
}
