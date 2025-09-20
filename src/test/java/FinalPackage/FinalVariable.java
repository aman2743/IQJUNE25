package FinalPackage;

public class FinalVariable {
    final int x=30;
    public void show(int a){
//       this.x=a;
        System.out.println(x);
    }

    public static void main(String[] args) {
        FinalVariable obj= new FinalVariable();
        obj.show(35);
    }

}
