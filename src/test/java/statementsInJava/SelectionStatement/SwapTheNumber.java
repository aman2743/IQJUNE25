package statementsInJava.SelectionStatement;

public class SwapTheNumber {
    public static void main(String[] args) {
        int x=10;
        int y=30;
        int z;
        z=x;
        x=y;
        y=z;

        System.out.println("The value of x is " +x);
        System.out.println("The value of y is " +y);
    }
}
