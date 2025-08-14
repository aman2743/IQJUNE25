package stringInJava;

public class Str2 {
    public static void main(String[] args) {
        String str="My Country Name is India";
//        char c=str.charAt(7);
//        System.out.println(c);
        int len=str.length();
        for (int i = 0; i <len ; i++) {
            System.out.print(str.charAt(i));
        }

    }
}
