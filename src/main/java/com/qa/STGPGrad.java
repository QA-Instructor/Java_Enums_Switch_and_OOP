package com.qa;

public abstract class STGPGrad extends Graduate{

    public String getRotationName() {
        return rotationName;
    }

    public void setRotationName(String rotationName) {
        this.rotationName = rotationName;
    }

    private String rotationName;

    @Override
    public String toString() {
        return "STGP Rotation for " + this.getFirstname() + " is: " + this.getRotationName();
    }
}
