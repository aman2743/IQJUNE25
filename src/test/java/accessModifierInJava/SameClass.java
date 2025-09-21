package accessModifierInJava;

public class SameClass {
    public static void main(String[] args) {
        AccessModifer1 AM1= new AccessModifer1();
        AM1.defaultMethod();
        AM1.protectedMethod();
        AM1.publicMethod();
    }
}
