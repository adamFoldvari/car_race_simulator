package com.car_race;

import java.util.ArrayList;
import java.util.Random;
import java.util.List;

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

    public static boolean isRaining(){
        Random random = new Random();
        if (random.nextInt(99) +1 <= 30){
            return true;
        }
        else{
            return false;
        }
    }

    public static List createVehicles(){
        List<Object>  vehicles= new ArrayList<>();
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

    public static List simulateRace(List<Object> vehicles){
        for (int i = 0; i < 50; i++){
            boolean rain = isRaining();
            for (Object vehicle: vehicles) {
                if (vehicle instanceof Car){
                    ((Car) vehicle).moveForAnHour();
                }
                else if (vehicle instanceof Motorcycle){
                    ((Motorcycle) vehicle).moveForAnHour(rain);
                }
                else {
                    ((Truck) vehicle).moveForAnHour();
                }
            }
        }
        return vehicles;
    }

    public static void printRaceResults(List vehicles){
        for (Object vehicle: vehicles){
            if (vehicle instanceof Car){
                System.out.print(((Car) vehicle).getName()+ " ");
                System.out.print(((Car) vehicle).getDistanceTraveled()+ "km" + " ");
                System.out.println(vehicle.getClass().getSimpleName());

            }
                else if (vehicle instanceof Motorcycle){
                System.out.print(((Motorcycle) vehicle).getName() + " ");
                System.out.print(((Motorcycle) vehicle).getDistanceTraveled() + "km" + " ");
                System.out.println(vehicle.getClass().getSimpleName());
            }
            else {
                System.out.print(((Truck) vehicle).getName() + " ");
                System.out.print(((Truck) vehicle).getDistanceTraveled() + "km" + " ");
                System.out.println(vehicle.getClass().getSimpleName());
            }
        }
    }
}
