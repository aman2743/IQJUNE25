package ExceptionInJava;

import java.io.File;

public class ExceptionInJava1 {
    public static void main(String[] args) {

        dostuff();
        System.out.println("Inside Main method");
    }
        static void dostuff(){
//            System.out.println(10/0);
            doMoreStuff();
            System.out.println("inside doStuff method");
        }
        static void doMoreStuff() {
        try{
                System.out.println(10 / 0);
                System.out.println("inside doMoreStuff method");
            } catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        }
    }
