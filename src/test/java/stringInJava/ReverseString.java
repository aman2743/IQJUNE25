package stringInJava;

public class ReverseString {
    public static void main(String[] args) {
        String str="Ramu Pal Jee Nayak";
       String []str1=str.split(" ");
       int len=str1.length;
        for (int i = len-1; i >=0 ; i--) {
            System.out.print(str1[i]+" ");

        }

    }
}
