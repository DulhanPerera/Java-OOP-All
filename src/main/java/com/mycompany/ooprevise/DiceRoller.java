/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

import java.util.Random;

/**
 *
 * @author Dulhan
 */
public class DiceRoller {
    int number;
    Random randomNum;
    
    DiceRoller(){
        randomNum = new Random();
        roll();
    }
    
    void roll(){
        number = randomNum.nextInt(6) + 1;
        System.out.println(number);
    }
}
