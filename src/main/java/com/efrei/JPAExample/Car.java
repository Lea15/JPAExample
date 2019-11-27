package com.efrei.JPAExample;

public class Car extends Vehicule{
    private int maxWeight;


    public Car(int plateNumber) {
        super(plateNumber);
    }

    public Car(int plateNumber, int maxWeight) {
        super(plateNumber);
        this.maxWeight = maxWeight;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}
