package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String fullName[] = keyboard.nextLine().trim().split(" ");

        System.out.print("Please enter the date of the movie in the following format (MM/dd/yyyy): ");
        String movieDateInput = keyboard.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate movieDateOutput = LocalDate.parse(movieDateInput, formatter);

        System.out.print("Please enter the amount of tickets you need: ");
        int ticketCount = keyboard.nextInt();


        if (ticketCount == 1) {
            System.out.printf("%d ticket reserved for %s under %s, %s.", ticketCount, movieDateOutput, fullName[1], fullName[0]);
        } // end of if

        else if (ticketCount > 1) {
            System.out.printf("%d tickets reserved for %s under %s, %s.", ticketCount, movieDateOutput, fullName[1], fullName[0]);
        } // end of else-if

        else {
            System.out.println("No tickets were bought!");
        }
    } // end of main()
}
