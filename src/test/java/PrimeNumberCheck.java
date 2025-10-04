import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number =:");
        int num = input.nextInt();
        boolean flag = false;
        for (int i = 2; i < num ; i++) {
            if(num%2==0){
                flag = true;
                break;
            }

        }
        if(flag==true){
            System.out.println("Number is not Prime ");
        }
        else {
            System.out.println("Number is Prime ");
        }
        if(flag==true){
            System.out.println("Number is not Prime ");
        }
        else {
            System.out.println("Number is Prime ");
        }
    }
}
