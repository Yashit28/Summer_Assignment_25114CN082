// Q3 = Write a program to Create ticket booking system . 

import java.util.Scanner;

class TicketBooking {
    int totalSeats = 50;
    int availableSeats = 50;

    // Book tickets
    void bookTicket(int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            System.out.println(seats + " ticket(s) booked successfully.");
        } else {
            System.out.println("Sorry! Only " + availableSeats + " seat(s) available.");
        }
    }

    // Cancel tickets
    void cancelTicket(int seats) {
        availableSeats += seats;
        if (availableSeats > totalSeats) {
            availableSeats = totalSeats;
        }
        System.out.println(seats + " ticket(s) cancelled successfully.");
    }

    // Display available seats
    void displaySeats() {
        System.out.println("Available Seats: " + availableSeats);
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketBooking ticket = new TicketBooking();

        int choice;

        do {
            System.out.println("\n===== Ticket Booking System =====");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Available Seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter number of tickets to book: ");
                    int book = sc.nextInt();
                    ticket.bookTicket(book);
                    break;

                case 2:
                    System.out.print("Enter number of tickets to cancel: ");
                    int cancel = sc.nextInt();
                    ticket.cancelTicket(cancel);
                    break;

                case 3:
                    ticket.displaySeats();
                    break;

                case 4:
                    System.out.println("Thank you for using the Ticket Booking System.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);

        sc.close();
    }
}
