package inheritanceInJava;

class AAA{
    public void m1(){
        System.out.println("inside m1");
    }

}
class BBB {
    public void m2(){
        System.out.println("inside m2");
    }
}

//class CCC extends BBB{
//    public void m3(){
//        System.out.println("inside m3");
//    }
//}
class CCC extends AAA{
    public void m3(){
        System.out.println("inside m3");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C obj=new C();
        obj.m1();
        obj.m2();
        obj.m3();
    }
}
