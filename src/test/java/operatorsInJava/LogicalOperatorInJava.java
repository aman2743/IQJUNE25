package operatorsInJava;

public class LogicalOperatorInJava {
    public static void main(String[] args) {
        int x=20;
        int y=10;
        int z=30;
        System.out.println(x==21 && y==11);
        System.out.println(x==21 || y==11);
        System.out.println(x==21 && y==10);
        System.out.println(x==21 || y==10);
        System.out.println(x==21 || y==10);
        System.out.println(x==20 || y==11);
        System.out.println(x==20 || y==11);
        System.out.println(x==20 && y==10);
        System.out.println(x==20 || y==10);
        System.out.println(x==20 || y==10);
        System.out.println(x==20 || y==10);
        System.out.println((x==20 || y==10)&&z==31);
        System.out.println((x==20 || y==10)&&z==31);
        System.out.println((x==20 || y==10)&&z==31);
        System.out.println((x==20 || y==10)&&z==30);
    }
}
