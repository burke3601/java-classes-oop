package com.company.project.java;

public class PickUpTruck extends Vehicle{
    private boolean hasHitch;
    private double towingCapacity;

    public PickUpTruck(String vin, int year, String make, String model, double towing) {
        super(vin, year, make, model);
        this.towingCapacity = towing;
    }

    public boolean getHasHitch() {
        return hasHitch;
    }

    public void setHasHitch(boolean hasHitch) {
        if (this.hasHitch){
            throw new IllegalArgumentException("Truck already has hitch installed");
        }
        this.hasHitch = hasHitch;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}