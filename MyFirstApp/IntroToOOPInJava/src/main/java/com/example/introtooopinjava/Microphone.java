package com.example.introtooopinjava;

public class Microphone {
    private String name;
    private String color;
    private int model;

    //Custom Constructor Video #30

    public Microphone(String name, String color, int model ) {
        this.name = name;
        this.color = color;
        this.model = model;
    }

    //Setters and Getters Video #31

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

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


    //Overloading The Constructors - Video #32


    public Microphone(){
    }

    public  Microphone(String name, String type ){
        this.name = name;
        this.color = color;
    }

}
