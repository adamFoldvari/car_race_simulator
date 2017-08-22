package com.car_race;

public class Main {

    public static void main(String[] args) {
	/*  static isRaining //30% chance of rain every hour
        createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
        simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
        printRaceResults() // prints each vehicle's name, distance traveled ant type. */
    Car testCar = new Car();
    System.out.println(testCar.name);
    System.out.println(testCar.normalSpeed);
    }
}
