import java.util.Scanner;

public class Aman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of units
        System.out.print("Enter the number of units used: ");
        int units = scanner.nextInt();

        // Nested if-else without logical operators
        if (units < 100) {
            System.out.println("Low Usage");
        } else {
            if (units <= 300) {
                if (units % 10 == 0) {
                    System.out.println("Moderate - Efficient Usage");
                } else {
                    System.out.println("Moderate Usage");
                }
            } else {
                System.out.println("High Usage");
            }
        }

        scanner.close();
    }
}
