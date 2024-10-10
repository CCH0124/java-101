package org.example.classes;

class Volvo {

    // fields
    String type;
    String model;
    String brand;
    int speed;

    // constructor
    Volvo(String type, String model, String brand) {
        this.type = type;
        this.model = model;
        this.brand = brand;
    }
    
    // methods
    int increaseSpeed(int increment) {
        this.speed = this.speed + increment;
        return this.speed;
    }
    
}
