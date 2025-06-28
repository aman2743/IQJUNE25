package StatementInjava;

public class LargestNumber {
    public static void main(String[] args) {
        int x=10;
        int y=25;
        int z=15;
        if(x>y && x>z){
            System.out.println("Largest number is x");

        }
        else if (y>z){
            System.out.println("largest number is y");
        }
        else{
            System.out.println("Largest number is z");
        }
    }
}
