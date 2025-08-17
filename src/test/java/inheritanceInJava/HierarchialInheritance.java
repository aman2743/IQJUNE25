package inheritanceInJava;

class AA{
    public void m1(){
        System.out.println("inside m1");
    }

}
class BB extends AA{
    public void m2(){
        System.out.println("inside m2");
    }
}

class CC extends AA{
    public void m3(){
        System.out.println("inside m3");
    }
}

class DD extends AA{
    public void m4(){
        System.out.println("inside m4");
    }
}


public class HierarchialInheritance {
    public static void main(String[] args) {
        DD obj=new DD();
        obj.m4();
        obj.m1();

    }
}
