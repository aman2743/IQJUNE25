package java_assignment_code;
import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter years of service: ");
        int years = scanner.nextInt();

        double bonus = 0;

        if (years > 20) {
            bonus = salary * 0.20;
        } else if (years > 15) {
            bonus = salary * 0.15;
        } else if (years > 10) {
            bonus = salary * 0.10;
        } else if (years > 5) {
            bonus = salary * 0.05;
        }

        System.out.println("Bonus amount: " + bonus);
    }
}
