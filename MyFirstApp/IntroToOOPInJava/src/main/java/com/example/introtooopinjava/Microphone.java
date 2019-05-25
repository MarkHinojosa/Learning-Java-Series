package com.example.introtooopinjava;

public class Microphone {
    String name;
    String color;
    int model;


    public void  turnOn(){
        System.out.println(this.name + " Turn On");
    }
    public void turnOff () {
        System.out.println(this.name + " Turn Off");

    }
    public void setVolume(){
        System.out.println(this.name + " Setting Volume");
    }

    public String showDescription(){
        return "Name:" + this.name + " Color: " + this.color + " Model: " + this.model;
    }
}
