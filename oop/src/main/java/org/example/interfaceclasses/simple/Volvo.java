package org.example.interfaceclasses.simple;

public class Volvo implements Vehicle{

    @Override
    public void engine() {
        System.out.println("B420T11");
    }

    @Override
    public int price() {
        return 500;
    }
    
}
