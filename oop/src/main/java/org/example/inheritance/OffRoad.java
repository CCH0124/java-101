package org.example.inheritance;

public interface OffRoad {
    default boolean OffRoadMountain() {
        return true;
    }
    
    default boolean OffRoadWater() {
        return true;
    }

    default boolean OffRoadSnow() {
        return true;
    }
}
