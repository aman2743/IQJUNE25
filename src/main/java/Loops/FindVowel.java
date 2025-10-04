package Loops;
//A loop in java is a process to control structure used to execute a block of code repeatly as log as a speccified condition true.
import java.util.Scanner;

public class FindVowel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the String = :");
        String str = input.nextLine();
        String text = str.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("THis is vowel. " + ch + " at index " + i);

            }
        }

        }
    }

