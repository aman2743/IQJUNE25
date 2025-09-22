package ExceptionInJava;

public class ExceptionInJava11 {
    static ArithmeticException ae=new ArithmeticException("/ by Zero");
    public static void main(String[] args) {

//            System.out.println(10/0);
        throw ae;
//        throw new ArithmeticException("Divided By Zero");
//        System.out.println("Inside Main Method"); //Unreachable Code
    }
    }
