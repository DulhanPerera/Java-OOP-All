/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class ObjectPassing {
    public static void main(String[] args){
        
        Garage garage = new Garage();
        
        ManyCars car1 = new ManyCars("Benz");
        ManyCars car2 = new ManyCars("BMW");
        
       
        garage.park(car1);
        garage.park(car2);
    }
}
