package java_assignment_code;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Sentences=:");
        String str = input.nextLine();

        String[] words = str.trim().split("\\s+");

        int wordcount = words.length;
        System.out.println("Number of words: " + wordcount);
    }
}
