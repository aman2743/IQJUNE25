package SamePackageSubClass;

public class AccessModifier2_Child extends AccessModifier2{
    AccessModifier2 obj=new AccessModifier2();
    public void TestMethod(){
        int x=obj.i;
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();
    }

    public static void main(String[] args) {
        AccessModifier2_Child obj2=new AccessModifier2_Child();
        obj2.TestMethod();
    }
}
