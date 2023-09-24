package com.sdj3assignment.sdj3_assignment_p2.Domain;

import java.util.Date;

public class Animal {

    int animalRegistrationNumber;
    double weight;
    Date date;
    Farm farm;

    public Animal(double weight, Date date, Farm farm) {
        this.weight = weight;
        this.date = date;
        this.farm = farm;
    }

    public int getAnimalRegistrationNumber() {
        return animalRegistrationNumber;
    }

    public double getWeight() {
        return weight;
    }

    public Date getDate() {
        return date;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setAnimalRegistrationNumber(int animalRegistrationNumber) {
        this.animalRegistrationNumber = animalRegistrationNumber;
    }
}
