package DifferentPkgChildSubClass;

import DifferentPkgParentClass.AccessModifier3;

public class ChildSubclassNew extends AccessModifier3 {

    public void TestNewMethod(){
    super.publicMethod();
    super.protectedMethod();

    }

    public static void main(String[] args) {
        ChildSubclassNew obj5=new ChildSubclassNew();
        obj5.TestNewMethod();
    }
}
