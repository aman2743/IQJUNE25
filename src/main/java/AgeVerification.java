
        import java.util.Scanner;

        public class AgeVerification {
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                // Input age
                System.out.print("Enter your age: ");
                int age = input.nextInt();

                // Check eligibility
                if (age >= 18) {
                    System.out.println("You are eligible.");
                } else {
                    System.out.println("You are not eligible.");
                }
            }
        }
