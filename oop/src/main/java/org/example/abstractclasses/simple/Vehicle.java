package org.example.abstractclasses.simple;

public abstract class Vehicle {
    protected String name;
    Vehicle (String name) {
        this.name = name;
        System.out.println(this.name);
    }
    public abstract void engine();

    public String upcaseCarName() {
        return this.name.toUpperCase();
    }
    
    public String getName() {
        return name;
    }

    
}
