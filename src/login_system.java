import java.util.Scanner;
public class login_system {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("would you want to login by phone or email");
    String str=sc.next();
    if (str.equals("phone"))
    {
        System.out.println("enter your 10 digit mobile number:");
        long phon=sc.nextLong();
        System.out.println("enter your password");
        String x=sc.next();
        System.out.println("you are login sucessfully");
    }
    if (str.equals("email"))
    {
        System.out.println("enter your email id:");
        String x=sc.next();
        System.out.println("enter your password:");
        String pass =sc.next();
        System.out.println("your are login successfully");
    }
    }
    }
