package com.efrei.JPAExample;

import javax.persistence.OneToMany;

public abstract class Vehicule {

    private int plateNumber;

    public Vehicule(int plateNumber) {
        this.plateNumber = plateNumber;
    }

    @OneToMany

    public int getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }
}
