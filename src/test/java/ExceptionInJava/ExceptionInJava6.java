package ExceptionInJava;

import java.io.FileNotFoundException;

public class ExceptionInJava6 {
    public static void main(String[] args) {
        System.out.println("stmt1");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException ae) {
            ae.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    }
