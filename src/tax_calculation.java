import java.util.Scanner;
public class tax_calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter car name:");

        String carname = sc.next();
        if (carname.equals("mahindra") || carname.equals("audi") || carname.equals("jaguar") || carname.equals("mercedes"))
        {
            System.out.println("enter price");
            int price = sc.nextInt();

            if (carname.equals("mahindra") && (price > 700000 && price < 1000000)) {
                int ans = price * 5 / 100;
                System.out.println(ans);
            } else if (carname.equals("audi") && (price >= 1000000 && price < 1500000)) {
                int ans = price * 10 / 100;
                System.out.println(ans);
            } else if (carname.equals("jaguar") && (price > 1500000 && price < 2000000)) {
                int ans = price * 25 / 100;
                System.out.println(ans);
            } else if (carname.equals("mercedes") && (price > 2000000 && price < 2500000)) {
                int ans = price * 30 / 100;
                System.out.println(ans);
            } else {
                System.out.println("chal nikal yaha se........");
            }
        }
    }
}
