/*
This application is used to allow customers to reserve tickets for a
specific date.
 */
package com.pluralsight;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {

        // create scanner
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their full name, the date of the show, and the number of
        //tickets they will need
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        // Format name
        String [] fullName = name.split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String stringDate = scanner.nextLine();

        // Convert string into date and accept 2 date formats
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("[MM/dd/yyyy][M/dd/yyyy]");
        LocalDate date = LocalDate.parse(stringDate,formatter);

        System.out.print("How many tickets would you like? ");
        int numOfTickets = scanner.nextInt();

        // Once the reservation is made, display a confirmation message to the customer

        // Display how many tickets were reserved
        if(numOfTickets == 1){
            System.out.printf("%d ticket reserved for ", numOfTickets);
        }
        else if(numOfTickets > 1) {
            System.out.printf("%d tickets reserved for ", numOfTickets);
        }
        // Display under what name the reservation was made
        System.out.print(date + " under " + lastName + ", " + firstName);
    }
}
