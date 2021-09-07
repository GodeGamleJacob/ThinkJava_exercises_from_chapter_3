package com.company;

import java.util.Random;
import java.util.Scanner;


//Below I will try to complete the exercises from this chapter, starting with a "sub-exercise" of conversion
class Main {
    //Converts centimeters to inches and then feet to inches
    public static void main(String[] args) {
        System.out.println("Hello...");
        System.out.println("How are you today? :)");
//Below I have declared a couple of variables
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);
//Above I have inserted a scanner
        System.out.println("Let me help you out with a little conversion. ");
        System.out.println("How many inches per centimeters? ");
        inch = in.nextInt();
//This is where - in the above - users input is outputted
        final double CM_PER_INCH = 2.54;
//I have created a so-called "final double"
        cm = inch * CM_PER_INCH;

        System.out.print(inch + " in = ");
        System.out.println(cm + " cm");

        inch = (int) (cm / CM_PER_INCH);
        System.out.printf("%f cm = %d in\n", cm, inch);

        System.out.println("\n");

        System.out.println("Let me help you out again. ;)");
        System.out.println("How many inches per feet?");
        inch = in.nextInt();
        double feet = (12 * inch);
        System.out.println(feet + " in ");
        System.out.println("\n");

//Below I will try to do the first real conversion exercise, converting Celsius to Fahrenheit
        System.out.println("I can help you convert Celsius to Fahrenheit :)");
        double F;
//First I created a double, for later use
        Scanner Fa = new Scanner(System.in);
//Then I created a new scanner in the above
        System.out.println("How many Celsius per Fahrenheit?");
//Now I prompted for user input
        double celsius = Fa.nextInt();
//Now a double is created, reacting to user input
        F = celsius * 9 / 5 + 32;
//A local variable is created for the math
        System.out.printf("%.2f C = %.2f F", celsius, F);
//The output is of formatted print, and I ask for 2 decimal floats, using the created variables - the double "celsius" and the local variable "F"
//Now the output is as requested by the chapter
        System.out.println("\n");

//In this assignment, I was asked to do a little "time-calculation"
//First I'll need an integer, called time
        int time;
        System.out.println("Hello, again!");
        System.out.println("Please let me know how many seconds, you want to convert into hours, minutes and seconds: ");
        Scanner sec = new Scanner(System.in);
//Here I have set up a scanner
        time = sec.nextInt();
//The scanner is paired to the integer
        int hours = time / 3600;
//I have to divide by the number of seconds per hour
        int minutes = (time % 3600 / 60);
//Here the division is happening for the minutes as well
        int seconds = (time % 3600 % 60);
//And finally I have to set the calculator to do the seconds.
        System.out.print("You have now converted:");
        System.out.printf("%d seconds to: %d hours, %d minutes, %d seconds.", time, hours, minutes, seconds);
//Here I am using, what I learned from Nicklas today, and matching the outputs to the integers
        System.out.println("\n");

//This next assignment is a bit harder

            System.out.println("Oh... hello there!");
            System.out.println("I want us to play a little game... ;)");
            System.out.println("Can you guess the magic number and get your price?");

            Scanner input = new Scanner(System.in);
            int yourNumber = input.nextInt ();
            System.out.println("Your guess was " + yourNumber);

            Random random = new Random();
            int number = random.nextInt();
            System.out.print("The magic number was ");
            System.out.println(number);

            int difference;
            difference = (yourNumber - number);

            if (difference < 0) {
                difference = difference * -1;
            }
            if (difference == 0) {
                System.out.println("Yay! You were correct!");
            } else {
                System.out.println("Your guess was off by this much: " + difference);
            }
        }
    }