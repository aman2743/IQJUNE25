package ExceptionInJava;

public class ExceptionInJava8 {
    public static void main(String[] args) {
        System.out.println("stmt1");
        try {
            System.out.println(10/0);
        } catch (NullPointerException ne) {
            ne.printStackTrace();
        }catch(ArrayIndexOutOfBoundsException ae){
            System.out.println("inside ArrayIndexOutOfBoundsException block ");
        }
        catch(Exception e){
            System.out.println("Inside Exception class");
        }
    }
    }
