package polymorphismInJava;

public class OverloadNew {
    public static void main(String[] args) {
        System.out.println("inside Main Method");
        main(10);
        main('h');
        main(10, 20);
    }

    public static void main(char c) {

        System.out.println(c);
    }

    public static void main(int x) {
        System.out.println(x);
    }
    public static void main(int x,int y){
        System.out.println(x+y);
    }

}
