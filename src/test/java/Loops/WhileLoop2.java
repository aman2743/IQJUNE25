package Loops;

public class WhileLoop2 {
    public static void main(String[] args) {
        int i=10;
        boolean b=true;
        while (b==true){
            if(i==6){
             b=false;
            }
            System.out.println(i);
            i=i-2;
        }
    }
}
