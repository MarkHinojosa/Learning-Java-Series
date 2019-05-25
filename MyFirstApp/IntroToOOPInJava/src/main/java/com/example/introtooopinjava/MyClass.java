package com.example.introtooopinjava;

public class MyClass {
    // ____Intro To Object Oriented Programming In Java___
    public static void main(String[] args){

//        --- Video 28 ---
//        ===Creating First Java Class
        Microphone microphone = new Microphone();
        microphone.color = "Blue";
        microphone.name = "Blue Yeti";
        microphone.model = 1234;

        Microphone rode = new Microphone();
        rode.color = "Red";
        rode.name = "Rode";
        rode.model = 12344;

        System.out.println(rode);
        System.out.println(microphone);




        microphone.turnOn();
        microphone.turnOff();
        microphone.setVolume();

        rode.turnOn();
        rode.turnOff();
        rode.setVolume();

        System.out.println(microphone.showDescription());
        System.out.println(rode.showDescription());



    }

}
