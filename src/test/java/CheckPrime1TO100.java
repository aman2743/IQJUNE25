import java.util.Scanner;

public class CheckPrime1TO100 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number =:");
        int no= input.nextInt();

        System.out.println("Prime numbers between 1 and " + no + " are:");

        for (int num = 2; num <= no; num++) {
            boolean isPrime = true;

            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
