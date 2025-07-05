package java_assignment_code;
import java.util.Scanner;

public class CarTaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Brand Name:");
        String brand = scanner.nextLine();
        System.out.println("Enter the price in rupees:");
        double price = scanner.nextDouble();

        double tax = 0;
        boolean valid = true;

        double priceInLakh = price / 100000;

        if (brand.equalsIgnoreCase("Mahindra") && priceInLakh >= 7 && priceInLakh <= 10) {
            tax = price * 0.05;
        } else if (brand.equalsIgnoreCase("Audi") && priceInLakh > 10 && priceInLakh <= 15) {
            tax = price * 0.10;
        } else if (brand.equalsIgnoreCase("Jaguar") && priceInLakh > 15 && priceInLakh <= 20) {
            tax = price * 0.25;
        } else if (brand.equalsIgnoreCase("Mercedes") && priceInLakh > 20 && priceInLakh <= 25) {
            tax = price * 0.30;
        } else {
            valid = false;
        }

        if (valid) {
            System.out.printf("Tax on the purchase: ₹%.2f\n", tax);
        } else {
            System.out.println("No tax applicable or invalid input.");
        }

    }
}
