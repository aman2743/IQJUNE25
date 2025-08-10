package ConstructorInJava;

public class Temp {
    public Temp(){
        this(5);
        System.out.println("inside default constructor");
    }

    public Temp(int x){
        this(5,10);
        System.out.println(x);
    }

    public Temp(int x,int y){
        int z=x+y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        Temp obj=new Temp();
        System.out.println("inside main method");
    }
}
