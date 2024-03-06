/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class ObjectArray {
    public static void main(String[] args){
        
//        Food[] refrigerator = new Food[3];
        
        Food food1 = new Food("Hotdog");
        Food food2 = new Food("Pizza");
        Food food3 = new Food("Taco");
        
        Food[] refrigerator = {food1, food2, food3};
        
//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;
        
        System.out.println(refrigerator[0].name);
        System.out.println(refrigerator[1].name);
        System.out.println(refrigerator[2].name);
    }
}