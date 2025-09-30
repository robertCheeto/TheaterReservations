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
        String movieDate = keyboard.nextLine().trim();
        LocalDate format = movieDate.ofPattern("MM/dd/yyyy");
        //DateTimeFormatter format = DateTimeFormatter.ofPattern("MM/dd/yyyy");




        System.out.print("Please enter the amount of tickets you need: ");
        int ticketCount = keyboard.nextInt();

        if (ticketCount == 1) {
            singleTicket();
        } // end of if

        else if (ticketCount > 1) {
            multipleTickets();
        } // end of else-if

        else {
            System.out.println("No tickets were bought!");
        }
    } // end of main()

    // display message format# ticket(s) reserved for (date) under (LastName, FirstName)

    public static void singleTicket() {
        //System.out.printf("%d ticket reserved for %s under %s, %s.", ticketCount, date, lastName, firstName);

    } // end of singleTicket


    public static void multipleTickets() {
        System.out.println("Multiple tickets");

    } // end of multipleTickets

    //TO-DO: add statements for user input on date, ticket number, display message to user
    // converting date to the standard version so program can print it out correctly
    // two if statements to differentiate 1 ticket vs 2+ tickets in display message
}
