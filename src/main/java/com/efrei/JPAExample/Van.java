package com.efrei.JPAExample;

public class Van extends Vehicule{
    private int numberOfSeats;


    public Van(int plateNumber) {
        super(plateNumber);
    }

    public Van(int plateNumber, int numberOfSeats) {
        super(plateNumber);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
