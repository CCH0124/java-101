package org.example.inheritance;

public class Volvo extends Car {
    public Volvo() {
        super(4, "volvo", 4);
    }

    @Override
    public String toString() {
        return model;
    }

    
}
