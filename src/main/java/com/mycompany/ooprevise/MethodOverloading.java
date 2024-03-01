/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class MethodOverloading {
    public static void main(String[] args) {
        // Overloaded Methods = methods that share the same name but g=have a different parameters 
        //                      method name + parameters = method signature.
        
        int e = add(1,2);
        int f = add(1,2,3);
        int g = add(1,2,3,4);
        double h = add(1.0,2.0);
        double j = add(1.0,2.0,3.0);
        double k = add(1.0,2.0,3.0,4.0);
        
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(j);
        System.out.println(k);
    }
    
    static int add(int a, int b){
        System.out.println("This is overloaded method #1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is overloaded method #2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is overloaded method #3");
        return a+b+c+d;
    }
    static double add(double a, double b){
        System.out.println("This is overloaded method #4");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is overloaded method #5");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is overloaded method #6");
        return a+b+c+d;
    }
}
