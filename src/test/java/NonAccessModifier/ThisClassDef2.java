package NonAccessModifier;

class TestNew1{
    public void M11(){
        System.out.println("inside M1 method");
    }

    public void M22(){
    this.M11();
    }

}

public class ThisClassDef2 {
    public static void main(String[] args) {
        TestNew1 obj= new TestNew1();
        obj.M22();
    }
}
