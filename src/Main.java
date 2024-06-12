import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int total_rows = scanner.nextInt();

        System.out.println("Enter the number of seats in each row");
        int seats_per_row = scanner.nextInt();

        int total_seats = total_rows * seats_per_row;

        if (total_seats <= 60) {
            int total_income = total_seats * 10;
            System.out.println("Total income:");
            System.out.printf("$%d", total_income);
        } else {
            int front_half_rows = total_rows / 2;
            int back_half_rows = total_rows - front_half_rows;
            int front_half_income = front_half_rows * seats_per_row * 10;
            int back_half_income = back_half_rows * seats_per_row * 8;
            int total_income = front_half_income + back_half_income;
            System.out.println("Total income:");
            System.out.printf("$%d", total_income);
        }
    }
}