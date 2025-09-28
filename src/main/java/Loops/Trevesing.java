package Loops;

public class Trevesing {
    public static void main(String[] args) {
        String s1 = "Python";
        int size = s1.length();
        for (int i = 0; i <size; i++) {
            System.out.println(i +" " + s1 + " " + s1.charAt(i));
        }
    }
}
