import java.util.Scanner;
public class display_last_digit {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int x=sc.nextInt();
        int ans=x%10;
        System.out.println(ans);
    }
    }