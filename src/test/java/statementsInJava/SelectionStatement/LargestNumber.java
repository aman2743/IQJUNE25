package statementsInJava.SelectionStatement;

public class LargestNumber {
    public static void main(String[] args) {
        int x=180;
        int y=25;
        int z=155;
        if(x>y && x>z){
            System.out.println("Largest number is x");
        }
        else if(y>z){
            System.out.println("Largest number is y");
        }
        else {
            System.out.println("Largest number is z");
        }

    }
}
