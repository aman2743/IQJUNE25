package Loops;

public class LoopsMultiply {
    public static void main(String[] args) {
        int product = 1;
        for (int i = 1; i <=5 ; i++) {
            product = product * i;
        }
        System.out.println("Product of numbers from 1 to 5 is: " + product);
    }
}
