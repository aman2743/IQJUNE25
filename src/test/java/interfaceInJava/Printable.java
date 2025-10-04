package interfaceInJava;

public interface Printable {
    int x=25;

   public static final int a=10;

    void A4(); // Default method

    private void A3(){ //private method
    System.out.println("inside interface");
    }
    static void A5(){ //static method
        System.out.println("inside Interface -> A5");
    }

}
