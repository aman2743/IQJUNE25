package java_assignment_code;
import java.util.Scanner;

public class ExamEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of classes held: ");
        int totalClasses = scanner.nextInt();

        System.out.print("Enter number of classes attended: ");
        int attendedClasses = scanner.nextInt();

        double attendancePercentage = (attendedClasses * 100.0) / totalClasses;

        if (attendancePercentage >= 75) {
            System.out.println("Student is eligible for the exam.");
        } else {
            System.out.println("Student is ineligible for the exam.");
        }
    }
}
