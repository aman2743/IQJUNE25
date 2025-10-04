package NonAccessModifier;

public class ConstructorCall {
    public ConstructorCall(){
        this(5);
        System.out.println("inside default constructor");
    }

    public ConstructorCall(int x){
        this(5,10);
        System.out.println(x);
    }

    public ConstructorCall(int x, int y){
        int z=x+y;
        System.out.println(z);
    }

    public static void main(String[] args) {
        ConstructorCall obj=new ConstructorCall();
        System.out.println("inside main method");
    }
}
