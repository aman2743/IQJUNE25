package ExceptionInJava;

public class ExceptionInJava10 {
    public static void main(String[] args) {
        System.out.println("stmt1");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException ne) {
            try {
                System.out.println(10/0);
            } catch (ArithmeticException ae) {
                System.out.println("inside internal catch block- ArithmeticException");
            }
        } catch (Exception e) {
            System.out.println("inside main Exception");
        }
    }
    }
