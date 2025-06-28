package StatementInjava;

public class SwapingTheNumber {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z;
        z=x;
        x=y;
        y=z;
        System.out.println("the value of x is " +x);
        System.out.println("the value of y is " +y);
    }
}
