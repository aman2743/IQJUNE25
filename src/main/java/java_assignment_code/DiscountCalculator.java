package java_assignment_code;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer type (Regular/Gold/Platinum): ");
        String customerType = scanner.next();

        System.out.print("Enter purchase amount: ");
        double amount = scanner.nextDouble();

        double discount = 0;

        if (customerType.equalsIgnoreCase("Regular")) {
            if (amount >= 500) {
                discount = 10;
            } else {
                discount = 5;
            }
        } else if (customerType.equalsIgnoreCase("Gold")) {
            if (amount >= 500) {
                discount = 15;
            } else {
                discount = 10;
            }
        } else if (customerType.equalsIgnoreCase("Platinum")) {
            if (amount >= 500) {
                discount = 20;
            } else {
                discount = 15;
            }
        }

        System.out.println("Discount percentage: " + discount + "%");
    }
}
