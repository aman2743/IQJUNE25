package Loops;
//write a program to print only odd number of generated number.
public class OddNumbers {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("Odd numbers from 1 to 20:");
        while (i <= 20) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
