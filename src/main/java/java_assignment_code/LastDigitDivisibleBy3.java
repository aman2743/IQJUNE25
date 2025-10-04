package java_assignment_code;
import java.util.Scanner;

public class LastDigitDivisibleBy3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int lastDigit = number % 10;

        if (lastDigit % 3 == 0) {
            System.out.println("Last digit " + lastDigit + " is divisible by 3.");
        } else {
            System.out.println("Last digit " + lastDigit + " is not divisible by 3.");
        }
    }
}
