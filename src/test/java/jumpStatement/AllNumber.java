package jumpStatement;

public class AllNumber {
    public static void main(String[] args) {
        int num=100;
        boolean flag=false;
        System.out.println("1 is prime number");
        System.out.println("2 is prime number");
        for(int i=3;i<=num;i++){
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    flag=true;
                }
            }
            if(flag==true){
                System.out.println(i +" Is not a Prime Number");
                flag=false;
            }
            else {
                System.out.println(i+" Is Prime Number");

            }
        }

    }
}
