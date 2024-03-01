/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class Methods {
    public static void main(String[] args){
        // Method = a block of code that executed whenever it is called upon
        
//        String name = "Dulhan";
//        int age = 22;
//        
//        hello(name, age);

        int x = 10, y = 12;
        
        System.out.println(add(x,y));
    }
    
    
    /**
     * Method without a return type
     * @param firstName
     * @param age 
     */
    static void hello(String firstName, int age){
        System.out.println("Hello " + firstName + ", You are " + age + " years old.");
    }
    
    /**
     * Method with a return type
     * @param a
     * @param b
     * @return 
     */
    static int add(int a,int b){
        int z = a+b;
//        return a + b;
        return z;
    }
}
