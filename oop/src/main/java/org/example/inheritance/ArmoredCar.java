package org.example.inheritance;

public class ArmoredCar extends Car implements Flyable, OffRoad {
    private int bulletProofWindows = 2;

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }

    public static String msg() {
    	return "ArmoredCar windows is 2"; 
    }
    
    public void otherMethod() {
        System.out.println(Flyable.duration);
    }
}
