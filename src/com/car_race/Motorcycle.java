package com.car_race;

import java.util.Random;

public class Motorcycle extends Vehicle {
    /* speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
       static nameNumber
       The number of the instance created. Used for its name.
       name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
       distanceTraveled
       moveForAnHour() */
    static private int nameNumber = 1;

    public Motorcycle(){
        setNormalSpeed(100);
        this.setName();
    }

    @Override
    public void setName(){
        this.name = "Motorcycle " + nameNumber++;
    }


    @Override
    public void moveForAnHour(){
        Random random = new Random();
        if (isRaining()){
            this.setDistanceTraveled(getNormalSpeed() - (random.nextInt(46) + 5));
        }
        else {
            this.setDistanceTraveled(getNormalSpeed());
        }
    }

    private boolean isRaining(){
        Random random = new Random();
        if (random.nextInt(99) +1 <= 30){
            return true;
        }
        else{
            return false;
        }
    }

}
