package com.qa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );
        ifPractice();
    }

    public static void ifPractice() {
        int luckyNumber = 13;

        if (luckyNumber % 2 == 0) {
            System.out.println("Your lucky number is EVEN");
        }

        else {
            System.out.println("Your lucky number is ODD");
        }
    }
}
