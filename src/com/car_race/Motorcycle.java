package com.car_race;

import java.util.Random;

public class Motorcycle {
    /* speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
       static nameNumber
       The number of the instance created. Used for its name.
       name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
       distanceTraveled
       moveForAnHour() */

    private int normalSpeed = 100;
    static int nameNumber = 1;
    private String name;
    private int distanceTraveled = 0;

    public int getNormalSpeed(){
        return this.normalSpeed;
    }

    public void setName(){
        this.name = "Motorcycle " + nameNumber++;
    }

    public String getName(){
        return this.name;
    }

    public void setDistanceTraveled(int distance){
        this.distanceTraveled += distance;
    }

    public int getDistanceTraveled(){
        return this.distanceTraveled;
    }

    Motorcycle(){
        this.setName();
    }

    public void moveForAnHour(boolean rain){
        Random random = new Random();
        if (rain){
            this.setDistanceTraveled(getNormalSpeed() - (random.nextInt(46) + 5));
        }
        else {
            this.setDistanceTraveled(getNormalSpeed());
        }
    }

}
