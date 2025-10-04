package java_assignment_code;
import java.util.Scanner;

public class UPSCSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Prelims marks: ");
        int prelims = scanner.nextInt();

        System.out.print("Enter Mains marks: ");
        int mains = scanner.nextInt();

        System.out.print("Enter Interview marks: ");
        int interview = scanner.nextInt();

        if (prelims >= 300 && mains >= 400 && interview >= 450) {
            System.out.println("Candidate qualifies for UPSC.");
        } else {
            System.out.println("Candidate does not qualify for UPSC.");
        }
    }
}
