package com.car_race;

public abstract class Vehicle {

    private int normalSpeed;
    protected String name;
    private int distanceTraveled = 0;

    public int getNormalSpeed() {
        return normalSpeed;
    }

    public void setNormalSpeed(int normalSpeed) {
        this.normalSpeed = normalSpeed;
    }

    public String getName() {
        return name;
    }


    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distance){
        this.distanceTraveled += distance;
    }

    public abstract void setName();

    public abstract void moveForAnHour();

}
