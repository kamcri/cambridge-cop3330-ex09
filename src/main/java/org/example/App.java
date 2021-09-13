/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kameryn Cambridge
 */
package org.example;
import java.util.Scanner;
import java.lang.Math;
public class App 
{
    public static void main( String[] args )
    {
        Scanner lengthScan = new Scanner(System.in);
        System.out.println("What is the length of your ceiling?");
        double length = lengthScan.nextDouble();

        Scanner widthScan = new Scanner(System.in);
        System.out.println("What is the width of your ceiling?");
        double width = widthScan.nextDouble();

        double area = length * width;
        double sqFeetGallon = 350;
        double gallonsNeeded = Math.ceil(area/sqFeetGallon);

        System.out.println("You will need " + gallonsNeeded + " gallons of paint to cover " + area + " square feet.");

    }
}
