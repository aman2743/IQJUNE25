package inheritanceInJava;

class One{
    public void m1(){
        System.out.println("inside m1");
    }
    public void m11(){
        System.out.println("inside m11");
    }
}
class Two extends One{
    public void m2(){
        System.out.println("inside m2");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Two obj=new Two();
        obj.m2();
        obj.m1();
        obj.m11();

    }
}
