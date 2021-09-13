/*
 *  UCF COP3330 Fall 2021 Assignment 1.9 Solution
 *  Copyright 2021 Amos Luo
 */

package org.example;
import java.util.Scanner;

public class App
{
    static final int ONEGALLON = 350;
    public static void main( String[] args ) {

        Scanner x = new Scanner(System.in);
        System.out.print("What is the length of the room in feet? "); //Asking for user input
        double len = x.nextInt(); //Storing user input
        System.out.print("What is the width of the room in feet? ");
        double width = x.nextInt();

        double area = len * width; //Doing math for square feet
        double gallons = Math.ceil(area/ONEGALLON); //Rounds math

        System.out.printf("You will need to purchase %.0f gallons of paint to cover %.0f square feet.", gallons, area);

    }
}