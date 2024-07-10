import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of rows and seats in each row
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        // Initialize the seating arrangement
        char[][] cinema = new char[rows][seats];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < seats; j++) {
                cinema[i][j] = 'S';
            }
        }

        // Print the initial seating arrangement
        System.out.println("Cinema:");
        printCinema(cinema);

        // Read the row and seat number for the chosen seat
        System.out.println("Enter a row number:");
        int chosenRow = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int chosenSeat = scanner.nextInt();

        // Calculate the ticket price
        int ticketPrice;
        int totalSeats = rows * seats;
        if (totalSeats <= 60) {
            ticketPrice = 10;
        } else {
            int frontHalf = rows / 2;
            if (chosenRow <= frontHalf) {
                ticketPrice = 10;
            } else {
                ticketPrice = 8;
            }
        }

        // Mark the chosen seat
        cinema[chosenRow - 1][chosenSeat - 1] = 'B';

        // Print the ticket price
        System.out.println("Ticket price: $" + ticketPrice);

        // Print the updated seating arrangement
        System.out.println("Cinema:");
        printCinema(cinema);
    }

    // Method to print the seating arrangement
    public static void printCinema(char[][] cinema) {
        System.out.print("  ");
        for (int i = 1; i <= cinema[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < cinema.length; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < cinema[i].length; j++) {
                System.out.print(cinema[i][j] + " ");
            }
            System.out.println();
        }
    }
}
