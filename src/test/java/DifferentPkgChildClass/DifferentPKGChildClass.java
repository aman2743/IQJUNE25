package DifferentPkgChildClass;
import DifferentPkgParentClass.AccessModifier3;

public class DifferentPKGChildClass {
    AccessModifier3 objnew=new AccessModifier3();
    public void TestNewMethod(){
        objnew.publicMethod();
    }

    public static void main(String[] args) {
        DifferentPKGChildClass obj3=new DifferentPKGChildClass();
        obj3.TestNewMethod();
    }

}
