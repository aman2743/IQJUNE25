package Loops;

public class ReverseString {
    public static void main(String[] args) {
        String str = "neha";
        String reversed = "";
        for (int i = 0; i < str.length(); i++) {
            reversed = str.charAt(i) + reversed;
            System.out.println(reversed);
        }

        System.out.println("Reversed: " + reversed);
    }
}
