
import java.util.Scanner;

public class FlightBookingApplication 
 {
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Kiran Air Booking");

        while (true) {
            System.out.println("1. View Flights");
            System.out.println("2. Book Flight");
            System.out.println("3. View Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.println("PN101 | Pune to Delhi | Rs.4000");

            } else if (choice == 2) {
                System.out.print("Enter flight code: ");
                String code = sc.nextLine();

                System.out.print("Enter passenger name: ");
                String name = sc.nextLine();

                System.out.print("Enter age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("Passenger type (Regular/Student): ");
                String type = sc.nextLine();

                System.out.print("Enter number of tickets: ");
                int tickets = sc.nextInt();
                sc.nextLine();

                double subtotal = tickets * 4000;
                double discount = 0;

                if (type.equalsIgnoreCase("Student")) {
                    discount = subtotal * 0.10;
                }

                double total = subtotal - discount;

                System.out.println("Booking confirmed!");
                System.out.println("Booking ID: BK1001");
                System.out.println("Flight: " + code + " | Pune to Delhi");
                System.out.println("Passenger: " + name);
                System.out.println("Passenger type: " + type);
                System.out.println("Tickets: " + tickets);
                System.out.println("Base fare per ticket: Rs.4,000");
                System.out.println("Subtotal: Rs." + (int) subtotal);
                System.out.println("Student discount (10%): Rs." + (int) discount);
                System.out.println("Final amount: Rs." + (int) total);

            } else if (choice == 3) {
                System.out.println("Booking details are displayed after booking.");

            } else if (choice == 4) {
                System.out.println("Thank you for using Kiran Air Booking!");
                break;

            } else {
                System.out.println("Invalid choice. Please select 1 to 4.");
            }
        }

        sc.close();
    }
}
