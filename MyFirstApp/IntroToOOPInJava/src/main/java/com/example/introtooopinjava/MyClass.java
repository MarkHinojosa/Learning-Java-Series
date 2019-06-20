package com.example.introtooopinjava;

import java.util.ArrayList;
import java.util.Arrays;

public class MyClass {
    // ____Intro To Object Oriented Programming In Java___
    public static void main(String[] args){

            //---Video 40--
            //--Video 41 ---

        /* ---Video 42 ---
        === Creating and Looping through Arrays===
        int[] myArray = { 1, 33, 4, 12, 89, 98}; //length = 6
        String [] names = {"James", "Anthony", "Rodrigo", "Niraj"};

        for (int i = 0; i < myArray.length; i++) {
        System.out.println("Items: " + myArray[i]);
        System.out.println(names[1]);

         */

        /* --- Video 43 ---
        === Presetting Arrays Length ===
                int[] newArray = new int[4];
        String[] newNames = new String[3];

        newArray[0] = 30;
        newArray[1] = 31;
        newArray[2] = 32;
        newArray[3] = 33;
//        newArray[4]= 34;

        newNames[0] = "dog";
        newNames[1] = "cat";
        newNames[2] = "mouse";

        for (int i = 0; i < newArray.length; i++) {
            System.out.println("Items: " + newArray[i]);

        }
        System.out.println(Arrays.toString(newNames));
         */

        /*
         --- Video 44 ---
         === ArrayLists - and Introduction ===
         //Arraylist allows ability to restrict data type into array
         // additionally can use object dot method to add/remove
                 ArrayList name = new ArrayList();
        name.add(1);
        name.add("Hello");
        name.remove("Hello");
        name.remove(0);
        System.out.println(name);
         */

        /*
        --- Video 45 ---
        === Looping Through Arrays ===
               ArrayList names = new ArrayList();
        names.add("James");
        names.add("Bond");
        names.add("Bonni");
        names.add("Arnold");

//        System.out.print(names.size());

        for (int i = 0; i < names.size(); i++){
            System.out.println("Names " + names.get(i));
        }

        //Clever for Loop
        for(Object n : names){

            System.out.println("Names: " + n);

        }
         */
        /*
        ---Video 47 ---
         */
        

    }

}



//        --- Video 28 ---
//        ===Creating First Java Class
    /*    Microphone microphone = new Microphone();
        microphone.color = "Blue";
        microphone.name = "Blue Yeti";
        microphone.model = 1234;

        Microphone rode = new Microphone();
        rode.color = "Red";
        rode.name = "Rode";
        rode.model = 12344;

        System.out.println(rode);
        System.out.println(microphone);

        //--- Video 29 ---
        ===Adding Description Method To Class

        microphone.turnOn();
        microphone.turnOff();
        microphone.setVolume();

        rode.turnOn();
        rode.turnOff();
        rode.setVolume();

        System.out.println(microphone.showDescription());
        System.out.println(rode.showDescription());
*/
      /*
        --- Video 30 ---
        ===Contructors In Java===
     Microphone microphone = new Microphone("Blue Yeti", "Blue", 1234);
      Microphone rode = new Microphone("Rode","Black",12344);
        System.out.println(microphone.showDescription());
        System.out.println(rode.showDescription());
        */

      /*
      ---Video 31 ---
      ===Setters and Getters===
        Microphone microphone = new Microphone("Blue Yeti","Blue",144);
        microphone.setColor("Black");
        microphone.setName("New Blue Yeti");
        microphone.setModel(1234);
        System.out.println(microphone);
        System.out.println(microphone.showDescription());
       */

      /*
      --- Video 32 ---
      ===Overloading Constructors===
      //Overloading just means having the ability to use different constructors in a class based
      on how many parameters are being used in the function call

      Microphone Alpha = new Microphone();
      Microphone Beta = new Microphone("Answer","Large");
       */

              /*
        ---Video 36 ---
        === Creating An Inheritance Structure ===

        Person james = new Person();
        Person carl = new Person("carl","winslow",45);
        Employee employee = new Employee();
        employee.setFirstName("James");
        employee.setLastName("Bond");
        employee.setAge(45);
        employee.setId(332);
        employee.setAnnualSalary(100000);

        System.out.println(employee.getAnnualSalary());

        Manager manager = new Manager();
        manager.setFirstName("Manager Carlos");
        manager.setLastName("Rodriguez");
        manager.setAge(45);
        manager.setAnnualSalary(45000);

        System.out.println(manager.getAnnualSalary() + ", " + manager.getFirstName());
*/

              /*
    ---Video 39 ---
    ===String is an Object After all!===
    //notice the .isEmpty() method that the String variable has access to


    String mystring = "";
    boolean isEmpty = mystring.isEmpty();

    if(!isEmpty){
        System.out.println(mystring);
    } else {
        System.out.println("Empty");
    }

     */