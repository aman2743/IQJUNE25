package operatorsInJava;

public class UnaryOperator3 {
    public static void main(String[] args) {
        int x=10;
        int y;
        y=x-- - --x;
        System.out.println("Value of y ="+y);
        System.out.println("Value of x ="+x);

    }
}
