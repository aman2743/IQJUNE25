package stringInJava;

public class SplitInString {
    public static void main(String[] args) {
        String str="Ramu Pal Jee Nayak";
       String []str1=str.split(" ");
       int len=str1.length;
        for (int i = 0; i <len ; i++) {
            System.out.print(str1[i]+" ");

        }

    }
}
