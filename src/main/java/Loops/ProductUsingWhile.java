package Loops;

//write a program to product of the all generated number by loop.
public class ProductUsingWhile {
    public static void main(String[] args) {
        int i = 1;
        int product = 1;

        while (i <= 5) {
            product = product * i;
            i++;
        }

        System.out.println("Product of numbers from 1 to 5 is: " + product);
    }
}

