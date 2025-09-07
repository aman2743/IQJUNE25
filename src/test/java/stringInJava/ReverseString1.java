package stringInJava;

public class ReverseString1 {
    public static void main(String[] args) {
        String str="Ramu Pal Jee Nayak";
       String []str1=str.split(" ");
       int len=str1.length;
        for (int i = 0; i <len ; i++) {
                 String str2=str1[i];
              int len1=str2.length();
              for(int j=len1-1;j>=0;j--){
                  System.out.print(str2.charAt(j));
              }
            System.out.print(" ");
        }

    }
}
