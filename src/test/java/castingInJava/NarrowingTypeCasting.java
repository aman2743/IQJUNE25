package castingInJava;

public class NarrowingTypeCasting {
    public static void main(String[] args) {
        short s;
        int i=54;
        s=(short)i;//Narrowing
        float f=12.45f;
        byte b=(byte)f;
        System.out.println(b);

    }
}
