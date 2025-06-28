import java.util.Scanner;
public class odd_even {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Number:");
        int x=sc.nextInt();
        if (x%2==0)
        {
            System.out.println("this is a even number");
        }
        else
        {
            System.out.println("this is a odd number");
        }

    }
}
