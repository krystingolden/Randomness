package com.pluralsight;

import java.util.Random;

public class Main {

    /*
https://programmingbydoing.com/

Randomness - Assignment #41
 */
    public static void main(String[] args) {
	// write your code here
        Random r = new Random();

        int x = 1 + r.nextInt(10);

        System.out.println( "My random number is " + x );

        System.out.println( "Here are some numbers from 1 to 5!" );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.print( 1 + r.nextInt(5) + " " );
        System.out.println();

        System.out.println( "Here are some numbers from 1 to 5 (again)" );
        System.out.print( r.nextInt(5) + " " );
        System.out.print( r.nextInt(5) + " " );
        System.out.print( r.nextInt(5) + " " );
        System.out.print( r.nextInt(5) + " " );
        System.out.print( r.nextInt(5) + " " );
        System.out.print( r.nextInt(5) + " " );
        System.out.println();

        System.out.println( "Here are some numbers from 1 to 5 that have 3 added to them!" );
        int temp = r.nextInt(5);
        System.out.println(temp + " is the first random number");
        System.out.println( 3 + temp + " is the first random number + 3" );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.print( 3 + r.nextInt(5) + " " );
        System.out.println();


        System.out.println( "Here are some numbers from 1 to 100!" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.print( 1 + r.nextInt(100) + "\t" );
        System.out.println();

        int num1 = 1 + r.nextInt(10);
        int num2 = 1 + r.nextInt(10);

        if ( num1 == num2 )
        {
            System.out.println( "The random numbers were the same! Weird." );
        }
        if ( num1 != num2 )
        {
            System.out.println( "The random numbers were different! Not too surprising, actually." );
        }
    }
}
