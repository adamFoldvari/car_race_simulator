package com.car_race;

import java.util.Random;

public class Truck {
    /* speed: 100km/h. 5% chance of breaking down for 2 hours.
       Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
       breakdownTurnsLeft // holds how long its still broken down.
       distanceTraveled
       moveForAnHour() */
    Random random = new Random();
    int normalSpeed = 100;
    int name = random.nextInt(1001);
    int breakdownTurnsLeft;
    int distanceTraveled;

    public void moveForAnHour(){
        if (breakdownTurnsLeft == 0){
            Random random = new Random();
            if (random.nextInt(99) +1 <= 5){
                breakdownTurnsLeft = 1;
            }
            else {
                distanceTraveled += normalSpeed;
            }
        }
        else {
            breakdownTurnsLeft--;
        }
    }
}
