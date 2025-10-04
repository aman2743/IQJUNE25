package ExceptionInJava;

public class ExceptionInJava2 {
    public static void main(String[] args) {
        System.out.println("stmt1");
        try {
            System.out.println("stmt2");
            System.out.println("stmt3");
        } catch (Exception e) {
            System.out.println("stmt4");
            System.out.println(10/0);
            System.out.println("stmt5");
        }
        System.out.println("stmt6");
    }
    }
