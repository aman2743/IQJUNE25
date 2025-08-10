package polymorphismInJava;

public class OberloadingInJava {
    public void add(int a,int b){
        int x=a+b;
        System.out.println(x);
    }

    public void add(int a,int b,int c){
    int x=a+b+c;
        System.out.println(x);
    }

    public void add(float a,float b){
      float x=a+b;
        System.out.println(x);
    }

    public void add(char c){
        System.out.println(c);
    }

    public static void main(String[] args) {
        OberloadingInJava obj=new OberloadingInJava();
        obj.add('c');
        obj.add(12.5f,12.5f);
    }


}
