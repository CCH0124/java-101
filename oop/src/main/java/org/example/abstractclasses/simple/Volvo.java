package org.example.abstractclasses.simple;

public class Volvo extends Vehicle {

    Volvo(String name) {
        super(name);
        System.out.println("Volvo class called.");
    }

    @Override
    public void engine() {
        System.out.println("B420T11");
    }
    
}
