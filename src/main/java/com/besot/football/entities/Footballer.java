package com.besot.football.entities;

import com.besot.football.enums.FitnessStatus;

public class Footballer extends User {

    private String position;
    private int jerseyNo;
    private FitnessStatus fitnessStatus;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getJerseyNo() {
        return jerseyNo;
    }

    public void setJerseyNo(int jerseyNo) {
        this.jerseyNo = jerseyNo;
    }

    public FitnessStatus getFitnessStatus() {
        return fitnessStatus;
    }

    public void setFitnessStatus(FitnessStatus fitnessStatus) {
        this.fitnessStatus = fitnessStatus;
    }

    @Override
    public String toString() {
        return "Name: "+ getName() +" Age: "+ getAge() + " Gender: " + getSex() + ", Identity Type: " +getIdtype()+", Position: " + position + " JerseyNo: " + jerseyNo + " Fitness Status: " + fitnessStatus;
    }
}
