/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Meola
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.println( "What is the input string?" );
        String string = scan.nextLine();
        int stringLength = string.length();
        System.out.println( string + " has " + stringLength + " characters" );

    }
}
