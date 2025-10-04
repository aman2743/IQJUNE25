package accessModifierInJava.AbstractionInJava;

public abstract class AbstractClassInJava {
    public void display(){
        System.out.println("inside display method");
    }
    public AbstractClassInJava(){

    }

    public final void print(){
        System.out.println("inside print method");
    }
    public abstract void show();

    public static void main(String[] args) {

    }

}
