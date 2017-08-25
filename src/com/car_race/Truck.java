package com.car_race;

import java.util.Random;

public class Truck {
    /* speed: 100km/h. 5% chance of breaking down for 2 hours.
       Truck drivers are boring. They call all their trucks a random number between 0 and 1000.
       breakdownTurnsLeft // holds how long its still broken down.
       distanceTraveled
       moveForAnHour() */
    Random random = new Random();
    private final int normalSpeed = 100;
    private int name = random.nextInt(1001);
    private int breakdownTurnsLeft;
    private int distanceTraveled;

    public int getNormalSpeed(){
        return this.normalSpeed;
    }

    public int getName(){
        return this.name;
    }

    public void setBreakdownTurnsLeft(int breakdowns){
        this.breakdownTurnsLeft += breakdowns;
    }

    public int getBreakdownTurnsLeft(){
        return this.breakdownTurnsLeft;
    }

    public void setDistanceTraveled(int distance){
        this.distanceTraveled += distance;
    }

    public int getDistanceTraveled(){
        return this.distanceTraveled;
    }

    public void moveForAnHour(){
        if (getBreakdownTurnsLeft() == 0){
            Random random = new Random();
            if (random.nextInt(99) +1 <= 5){
                setBreakdownTurnsLeft(1);
            }
            else {
                setDistanceTraveled(getNormalSpeed());
            }
        }
        else {
            setBreakdownTurnsLeft(-1);
        }
    }
}
