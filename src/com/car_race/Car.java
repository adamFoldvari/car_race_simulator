package com.car_race;
import java.util.*;

public class Car {
    /* Since cars are so fast there is a 30% chance that they can go only with 70km/h speed.
       static setSpeedLimit(int limit) // Call this from the Main class!
       normalSpeed // the normal speed of the car. Set to a random number in the constructor between 80-110km/h.
       name // Make a list from the words here: http://www.fantasynamegenerators.com/car-names.php and pick 2 randomly for each instance.
       distanceTraveled // holds the current distance traveled.
       moveForAnHour() // The vehicle travels for an hour. It increases the distance traveled. Call this from the main class only! */
    private int normalSpeed;
    private String name;
    private int distanceTraveled = 0;

    public void setNormalSpeed(int speed){
        this.normalSpeed = speed;
    }

    public int getNormalSpeed(){
        return normalSpeed;
    }

    public void setName(){
        Random random = new Random();
        int firstNameIndex = random.nextInt(carNames.size());
        this.name = carNames.get(firstNameIndex);
        carNames.remove(firstNameIndex);
        int lastNameIndex = random.nextInt(carNames.size());
        this.name = name + " " + carNames.get(lastNameIndex);
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

    public static void setSpeedLimit(Car car, int speed){
        car.setNormalSpeed(speed);
    }


    List<String> carNames = new LinkedList<>(Arrays.asList("Augury",
                                                        "Pinnacle",
                                                        "Barrage",
                                                        "Momentum",
                                                        "Hydra",
                                                        "Crux",
                                                        "Universe",
                                                        "Paladin",
                                                        "Hydra",
                                                        "TarragonEpiphany",
                                                        "Evolution",
                                                        "Passion",
                                                        "Tracer",
                                                        "Inception",
                                                        "Lioness",
                                                        "Pulse",
                                                        "Basilisk",
                                                        "Obsidian",
                                                        "PaladinOlympian",
                                                        "Momentum",
                                                        "Sliver",
                                                        "Spotlight",
                                                        "Revelation",
                                                        "Passion",
                                                        "Climax",
                                                        "Empire",
                                                        "Centaur",
                                                        "Gallop"));

    Car(){
        Random random = new Random();
        setNormalSpeed(random.nextInt(31) + 80);
        setName();
        }

    public void moveForAnHour(){
            setDistanceTraveled(getNormalSpeed());
    }
}

