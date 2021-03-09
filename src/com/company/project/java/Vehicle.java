package com.company.project.java;

public abstract class Vehicle {

    protected String vin;
    protected int year;
    protected String make;
    protected String model;
    private String owner;
    private double currentMileage = 0;
    private int numberOfPassengers;

    public Vehicle(String vin, int year, String make, String model) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1750) {
            throw new IllegalArgumentException("Year must be later than 1750");
        }
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public double getCurrentMileage() {
        return currentMileage;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getVin() {
        return vin;
    }

    public void addMileage(double miles) {
        this.currentMileage += miles;
    }
}
