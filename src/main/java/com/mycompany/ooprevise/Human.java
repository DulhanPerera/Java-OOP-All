/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class Human {
    
    String name;
    int age;
    double weight;
    
    Human(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    
    void eat(){
        System.out.println(this.name + " is eating.");
    }
    
    void drink(){
        System.out.println(this.name+ " is driking.");
    }
}
