package com.mycompany.ooprevise;

/**
 *
 * @author Dulhan
 */
public class StaticKeyword {
    public static void main(String[] args){
        // Static - modifier, A single copy of a variable/ method is created and shared.
        //          the class "owns" the static member.
    	
    	Friends friend1 = new Friends("Shaggy");
    	Friends friend2 = new Friends("Scooby");
    	Friends friend3 = new Friends("Freddy");
    	Friends friend4 = new Friends("Welma");
    	
//    	System.out.println(Friends.numberOfFriends); // this will print number of friends inside the main method.
    	Friends.displayFriends();
    }
}
