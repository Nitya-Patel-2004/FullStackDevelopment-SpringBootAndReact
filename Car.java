package com.packt.cardatabase;

public class Car {
     private final OwnerService owner; // Made 'final' to show it must be set in the constructor

    // Constructor Injection
    public Car(OwnerService injectedOwner) {
        this.owner = injectedOwner; // The dependency (Owner) is set when the Car is BORN.
    }

    public void startJourney() {
        System.out.println("Car is starting its journey...");
        System.out.println("Verification: " + owner.getOwnerDetails());
    }
    

}
