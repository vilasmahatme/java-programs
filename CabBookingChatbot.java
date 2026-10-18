
import java.util.Scanner;

public class CabBookingChatbot 
    {

    public static void main(String[] args)
       {

        Scanner sc = new Scanner(System.in);

        while (true) 
         {
            System.out.println("\n=== CAB BOOKING CHATBOT ===");
            System.out.println("1. Book Ride");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            if (choice == 2) 
             {
                System.out.println("Thank you! Goodbye.");
                break;
             }

            if (choice != 1) 
             {
                System.out.println("Invalid choice. Try again.");
                continue;
             }

            System.out.println("\nChoose Cab Type:");
            System.out.println("1. Auto - Rs.12/km");
            System.out.println("2. Sedan - Rs.18/km");
            System.out.println("3. SUV - Rs.25/km");
            System.out.print("Enter choice: ");

            int cab = sc.nextInt();
            String cabType;
            int rate;

            if (cab == 1) {
                cabType = "Auto";
                rate = 12;
            } else if (cab == 2) {
                cabType = "Sedan";
                rate = 18;
            } else if (cab == 3) {
                cabType = "SUV";
                rate = 25;
            } else {
                System.out.println("Invalid cab choice.");
                continue;
            }

            System.out.println("\nChoose Route:");
            System.out.println("1. Pune Station to Shivajinagar (5 km)");
            System.out.println("2. Swargate to Kothrud (8 km)");
            System.out.println("3. Hinjawadi to Wakad (10 km)");
            System.out.print("Enter route: ");

            int route = sc.nextInt();
            String source, destination;
            int distance;

            if (route == 1) 
             {
                source = "Pune Station";
                destination = "Shivajinagar";
                distance = 5;
            } else if (route == 2)
             {
                source = "Swargate";
                destination = "Kothrud";
                distance = 8;
            } else if (route == 3) {
                source = "Hinjawadi";
                destination = "Wakad";
                distance = 10;
            } else 
            {
                System.out.println("Invalid route choice.");
                continue;
            }

            int fare = rate * distance;

            System.out.println("\n=== RIDE DETAILS ===");
            System.out.println("Cab Type: " + cabType);
            System.out.println("Source: " + source);
            System.out.println("Destination: " + destination);
            System.out.println("Distance: " + distance + " km");
            System.out.println("Rate: Rs." + rate + "/km");
            System.out.println("Total Fare: Rs." + fare);

            System.out.println("\n1. Confirm & Share OTP");
            System.out.println("2. Cancel Ride");
            System.out.print("Enter choice: ");

            int confirm = sc.nextInt();

            if (confirm == 2)
            {
                System.out.println("Ride cancelled. No OTP shared.");
            } else if (confirm == 1) {
                int otp = 1000 + (int)(Math.random() * 9000);
                System.out.println("Your OTP is: " + otp);
                System.out.println("Booking confirmed!");
                System.out.println("Cancellation is not allowed after OTP sharing.");
            } else 
            {
                System.out.println("Invalid choice. Ride not confirmed.");
            }
        }

        sc.close();
    }
}
