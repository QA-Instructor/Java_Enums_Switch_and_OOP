package com.qa;

public class Vehicle implements Alarm{

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    private String make;

}
