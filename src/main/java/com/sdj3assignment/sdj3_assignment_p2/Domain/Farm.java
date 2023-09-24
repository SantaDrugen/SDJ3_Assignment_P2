package com.sdj3assignment.sdj3_assignment_p2.Domain;

public class Farm {

    int farmId;
    String farmName;

    public Farm(String farmName) {
        this.farmName = farmName;
    }

    public int getFarmId() {
        return farmId;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmId(int farmId) {
        this.farmId = farmId;
    }
}
