package ExceptionInJava;

public class ExceptionInJava15 {

    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    }
