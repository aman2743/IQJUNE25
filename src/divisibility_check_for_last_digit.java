import java.util.Scanner;
public class divisibility_check_for_last_digit {
    public static void main(String[] args) {
        Scanner sc= new  Scanner (System.in);
        int x= sc.nextInt();
        int y= x%10;
        System.out.println(y);
        if(y%3==0)
        {
            System.out.println("yes ");
        }
        else {
            System.out.println("no");
        }
        }
    }


