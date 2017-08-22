package com.car_race;

import java.util.Random;

public class Motorcycle {
    /* speed is 100km/h. If rains, travels with 5-50km/h slower (randomly).
       static nameNumber
       The number of the instance created. Used for its name.
       name // Are called "Motorcycle 1", "Motorcycle 2", "Motorcycle 3",... Unique.
       distanceTraveled
       moveForAnHour() */

    int normalSpeed = 100;
    static int nameNumber = 1;
    String name;
    int distanceTraveled = 0;

    Motorcycle(){
        this.name = "Motorcycle " + nameNumber++;
    }

    public void moveForAnHour(boolean rain){
        Random random = new Random();
        if (rain){
            distanceTraveled += (normalSpeed - (random.nextInt(46) + 5));
        }
        else {
            distanceTraveled += normalSpeed;
        }
    }

}
