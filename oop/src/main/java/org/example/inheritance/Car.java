package org.example.inheritance;

public class Car {
    private final int DEFAULT_WHEEL_COUNT = 4;
	private final String DEFAULT_MODEL = "Basic";
    private final int DEFAULT_DOORS = 4;
    protected int wheels;
    protected String model;
    protected int doors;
    
    public Car() {
        this.wheels = DEFAULT_WHEEL_COUNT;
        this.model = DEFAULT_MODEL;
        this.doors = DEFAULT_DOORS;
    }

    public Car(int wheels, String model, int doors) {
        this.wheels = wheels;
        this.model = model;
        this.doors = doors;
    }

    public void start() {
        // If okay, start.
    }

    public static String msg() {
        return "Car";
    }

    @Override
    public String toString() {
        return "Car [model=" + model + "]";
    }
    
}
