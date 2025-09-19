package inheritanceInJava;

class A{
    public void m1(){
        System.out.println("inside m1");
    }

}
class B extends A{
    public void m2(){
        System.out.println("inside m2");
    }
}

class C extends B{
    public void m3(){
        System.out.println("inside m3");
    }
}


public class MultiLevelInheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
