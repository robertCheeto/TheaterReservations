package com.pluralsight;

import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String fullName = keyboard.nextLine().trim();

        System.out.println("Please enter the date of the movie in the following format (MM/dd/yyyy): ");

        System.out.println("Please enter the amount of tickets you need: ");
    } // end of main()

    //TO-DO: add statements for user input on date, ticket number, display message to user
    // converting date to the standard version so program can print it out correctly
    // two if statements to differentiate 1 ticket vs 2+ tickets in display message
}
