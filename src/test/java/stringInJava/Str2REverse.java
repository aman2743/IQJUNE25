package stringInJava;

public class Str2REverse {
    public static void main(String[] args) {
        String str="My Country Name is India";
        int len=str.length();
        System.out.println(len);
        for (int i = len-1; i >=0 ; i--) {
            System.out.print(str.charAt(i));
        }

    }
}
