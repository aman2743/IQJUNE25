package Loops;

public class starPattern7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 3; i >= 0; i--) {
            for (int j = i; j >=0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}