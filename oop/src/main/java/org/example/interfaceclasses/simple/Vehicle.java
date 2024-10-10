package org.example.interfaceclasses.simple;

public interface Vehicle {
    String denied = "TAIWAN";

    default void description() {
        System.out.println("Vehicle description");
    }
    // Abstract method
    void engine();
    // Abstract method
    int price();

    static boolean manufacturer(String name) {
        if (denied.equals(name.toUpperCase())) {
            return false;
        }

        return true;
    }
}
