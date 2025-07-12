package Loops;

public class starPattern5 {
    public static void main(String[] args) {
        for (int i = 0; i <=4 ; i++) {//Outer Loop
            for (int j = 0; j <=4 ; j++) { //Inner loop
                System.out.print("*");
            }
            System.out.println();
            for (int k = 0; k <=i ; k++) {
                System.out.print(" ");
            }
        }

    }
}
