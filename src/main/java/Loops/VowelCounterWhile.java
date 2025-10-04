package Loops;
import java.util.Scanner;

//wap to count the total number of vowel in any string.
public class VowelCounterWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;
        int i = 0;

        str = str.toLowerCase();

        while (i < str.length()) {
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }

            i++;
        }

        System.out.println("Total number of vowels: " + count);

    }
}
