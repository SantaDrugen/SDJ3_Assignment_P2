package com.sdj3assignment.sdj3_assignment_p2.Domain;

import java.util.Date;

public class Animal {

    private int animalRegistrationNumber;
    private double weight;
    private Date dateOfArrival;
    private Farm farm;

    public Animal(double weight, Date date, Farm farm) {
        this.weight = weight;
        this.dateOfArrival = date;
        this.farm = farm;
    }

    public int getAnimalRegistrationNumber() {
        return animalRegistrationNumber;
    }

    public double getWeight() {
        return weight;
    }

    public Date getDate() {
        return dateOfArrival;
    }

    public Farm getFarm() {
        return farm;
    }

    public void setAnimalRegistrationNumber(int animalRegistrationNumber) {
        this.animalRegistrationNumber = animalRegistrationNumber;
    }
}
