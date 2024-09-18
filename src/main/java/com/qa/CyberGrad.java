package com.qa;

public class CyberGrad extends STGPGrad{
    @Override
    public String myAbstractMethod(String message) {
        return "Cyber grad shouts " + message.toUpperCase();
    }
}
