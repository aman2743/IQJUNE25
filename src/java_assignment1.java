import java.util.Scanner;
public class java_assignment1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int age=sc.nextInt();
        if (age>0 && age<=120)
        {
            if (age > 18)
            {
                System.out.println("you are eligibleto vote");
            } else
            {
                System.out.println("you are not eligible to vote");
            }
        }
        else
        {
            System.out.println("invalid age");
        }
    }
}
