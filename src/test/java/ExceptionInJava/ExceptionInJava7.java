package ExceptionInJava;

public class ExceptionInJava7 {
    public static void main(String[] args) {
        System.out.println("stmt1");
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            e.printStackTrace();
//        }catch (ArithmeticException ae) {
//            ae.printStackTrace();
//        }
        }
    }
}
