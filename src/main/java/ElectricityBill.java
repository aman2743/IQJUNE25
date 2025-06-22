import java.util.Scanner;

    public class ElectricityBill {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            // Get customer name and unit input
            System.out.print("Enter Customer Name: ");
            String name = input.nextLine();

            System.out.print("Enter Units Consumed: ");
            int units = input.nextInt();

            double amount = 0;

            // Billing logic
            if (units <= 100) {
                amount = units * 3; // ₹3 per unit
            } else if (units <= 300) {
                amount = 100 * 3 + (units - 100) * 5; // ₹3 for first 100, ₹5 for next 200
            } else {
                amount = 100 * 3 + 200 * 5 + (units - 300) * 7; // ₹7 for units above 300
            }

            // Display bill
            System.out.println("\n------ Electricity Bill ------");
            System.out.println("Customer Name: " + name);
            System.out.println("Units Consumed: " + units);
            System.out.println("Total Amount: ₹" + amount);
        }
    }
