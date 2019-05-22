package com.example.learnjava;

import java.sql.SQLOutput;

public class MyClass {
    public static void main(String[] args) {


//        System.out.println("Hello World");

//        //variable == bucket in memory
//        int age = 23; //int is smaller in capacity than long
//        long weightOfPlanet = 944342543;
//        byte b = 127; // 127 is max
//        short s = 156; //shot is 2x size of byte
//
//
//
//        //1.3,4.4, 0.2... decimal numbers
//
//        //add f to signify float or double
//        float pi = 3.14f;
//        double pid = 3.14; //bigger with more precision
//
//
//
//        String name = "Georgina";//unlimited string length
//        char a = 77; //only 1 character allowed, or number converted to unicode, notice single quotes
//
//
//        boolean isTrue;
//        isTrue = true;
//
//        System.out.println("My name is " + isTrue  + " and I'm " + age + " years old.");

//        double a = 12;
//        double b = 12;

        //Subtraction and addition (-,+)
        //double total = (int) (b / a);//casting

//        double a = 12;
//        double b = 7;
//        double remainder = a % b;//remainder % == "what remains...
//        System.out.println("Remainder is: " + remainder);


//        _____________

        //Control Flow - Introduction Video #17
        //if statements
//
//        --- Relational Operators ---
//            = --> assignment
//            == --> comparison
//            != --> NOT
//            ! -- Negation
//              > --> GREATER THAN
//            < --> LESS THAN
//            >= --> GREATER THAN OR EQUAL TO
//            <= --> LESS THAN OR EQUAL TO
//        double a = 13;
//        double b = 11;
//        boolean isAged = true;
//
//        if( a >= b ) {
//            System.out.println("Indeed!");
//        } else {
//            System.out.println("Not true!");
//        }
       /*
        - Video #19 -
        ===Logical Operators ===
        AND --> : returns false if one is false
        OR --> || : returns true if one side is true
        ! --> Negation

        if (isAged || isNotAged){
            System.out.println("Can consume beer!");
        }else {
            System.out.println("Not allowed to consume beer!");
        }

         */

       /*
            - Video #20 -
            ===For Loops===
         for (int i = 0; i < 20; i++) {
            if( i % 3 == 0){
                System.out.println( i + " is multiple of 3");
            }
        }
        */


       /* - Video #21 -
       === Methods and String Parameters ===
       *Make the method call from within the "main" method*
         showName("mark");
         *Place the method outside of the "main" method*


           public static void showName(String name) {
        System.out.println("Name is " + name);
    }

        */

       /* - Video 22 -
       === Function Parameters ===
       *make the method call from within the main method
       * place method body outside of main method
       *
       *
     addNumbers(5,3);
        multiplyNumbers(4, 3);
        divideNumbers(35,7);

        public static void addNumbers(int a, int b){
            int sum = a + b;
            System.out.println("Addition Sum is: " + sum);
        }

        public static void multiplyNumbers(int a, int b){
            int sum = a * b;
            System.out.println("Multiply sum is: " + sum);
        }

        public static void divideNumbers(int a, int b){
            int sum = a / b;
            System.out.println("Divide sum is: " + sum);

        }
        
        */


    }




}
