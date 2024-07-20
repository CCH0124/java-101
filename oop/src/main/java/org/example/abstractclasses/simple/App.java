package org.example.abstractclasses.simple;

public class App {
    public static void main(String[] args) {
        Vehicle v = new Volvo("Volvo XC90");
        v.engine();

        System.out.println(v.upcaseCarName());
    }
}
