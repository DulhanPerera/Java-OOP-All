/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class Objects {

    public static void main(String[] args) {
        
        // Creating new object using 'Car' class
        Car myCar = new Car();
        Car myCar2 = new Car();
        
        System.out.println(myCar.model);
        System.out.println(myCar.make);
        
        myCar.drive();
        myCar.brake();
        
        // Adding small line space
        System.out.println();
        
        System.out.println(myCar2.model);
        System.out.println(myCar2.color);
        myCar2.brake();
    }
}
