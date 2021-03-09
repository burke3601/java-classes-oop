package com.company.project.java;

public class Main {

    public static void main(String[] args) {
	    var myCar = new Car("ABCD1234XYZ1234", 2016, "Toyota", "Prius");
	    myCar.addMileage(25.5);
    }

    public static void main(String[] args) {
        var myTruck = new PickUpTruck("VIN1234VIN1234VI", 2002, "Ford", "F-150");
        myTruck.addMileage(200000);

    }
}
