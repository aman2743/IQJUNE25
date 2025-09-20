package NonAccessModifier;

class TestNew{
    int i;// instance Variable
    public void M1(int x){
        System.out.println(x);
        this.i=x;
    }

    public void M2(){
        System.out.println(i);
    }

}

public class ThisClassDef1 {
    public static void main(String[] args) {
        TestNew obj= new TestNew();
        obj.M1(100);
        obj.M2();
    }
}
