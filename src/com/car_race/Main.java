package com.car_race;

import sun.font.TrueTypeFont;

public class Main {

    public static void main(String[] args) {
	/*  static isRaining //30% chance of rain every hour
        createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
        simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
        printRaceResults() // prints each vehicle's name, distance traveled ant type. */
    Motorcycle testCycle = new Motorcycle();
    testCycle.moveForAnHour(true);
    testCycle.moveForAnHour(false);
    System.out.println(testCycle.name);
    System.out.println(testCycle.normalSpeed);
    System.out.println(testCycle.distanceTraveled);

    Motorcycle testCycle2 = new Motorcycle();
    testCycle2.moveForAnHour(true);
    testCycle2.moveForAnHour(false);
    System.out.println(testCycle2.name);
    System.out.println(testCycle2.normalSpeed);
    System.out.println(testCycle2.distanceTraveled);
    }
}
