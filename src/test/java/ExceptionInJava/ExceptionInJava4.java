package ExceptionInJava;

public class ExceptionInJava4 {
    public static void main(String[] args) {
        System.out.println("stmt1");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
    }
