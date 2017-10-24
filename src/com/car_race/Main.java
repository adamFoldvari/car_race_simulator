package com.car_race;

import java.util.*;

public class Main {
    /*  static isRaining //30% chance of rain every hour
        createVehicles() // creates 10 cars, 10 trucks and 10 motorcycles
        simulateRace() // simulates the race by calling moveForAnHour() on every vehicle 50 times and setting whether its raining.
        printRaceResults() // prints each vehicle's name, distance traveled ant type. */
    public static void main(String[] args) {
        List vehicles = createVehicles();
        simulateRace(vehicles);
        printRaceResults(vehicles);
}

    public static List createVehicles(){
        List<Vehicle>  vehicles= new ArrayList<>();
        for (int i = 0; i < 30; i++){
            if (i < 10){
                vehicles.add(new Car());
                Random random = new Random();
                if (random.nextInt(99) +1 <= 30){
                    Car.setSpeedLimit((Car) vehicles.get(i), 70);
                }
            }

            else if (i < 20){
                vehicles.add(new Motorcycle());
            }
            else {
                vehicles.add(new Truck());
            }
        }
        return vehicles;
    }

    public static List simulateRace(List<Vehicle> vehicles) {
        for (int i = 0; i < 50; i++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.moveForAnHour();
            }
        }
        return vehicles;
    }

    public static void printRaceResults(List<Vehicle> vehicles){
        vehicles.sort(Comparator.comparing(Vehicle::getDistanceTraveled).reversed());
        for (Vehicle vehicle: vehicles){
                System.out.print(vehicle.getName()+ " ");
                System.out.print(vehicle.getDistanceTraveled()+ "km" + " ");
                System.out.println(vehicle.getClass().getSimpleName());
        }
    }
}
