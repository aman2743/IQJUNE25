package java_assignment_code;
import java.util.Scanner;


public class LoginSystem {
    public static void main(String[] args) {
        String correctEmail = "nehabansal5sep@gmail.com";
        String correctMobile = "8160798609";
        String correctPassword = "neha";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Login using: 1. Email  2. Mobile Number");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        boolean loginSuccess = false;

        if (choice == 1) {
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (email.equals(correctEmail) && password.equals(correctPassword)) {
                loginSuccess = true;
            }

        } else if (choice == 2) {
            System.out.print("Enter mobile number: ");
            String mobile = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            if (mobile.equals(correctMobile) && password.equals(correctPassword)) {
                loginSuccess = true;
            }

        } else {
            System.out.println("Invalid choice.");
        }

        if (loginSuccess) {
            System.out.println("Login successful.");
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
    }
}
