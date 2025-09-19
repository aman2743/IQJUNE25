package jumpStatement;

public class NotAPrimeNumber1TO100 {
    public static void main(String[] args) {
        int num=100;
        boolean flag=false;

        for(int i=3;i<=num;i++){
            for (int j = 2; j <i ; j++) {
                if(i%j==0){
                    flag=true;
                    break;
                }
            }
            if(flag==true){
                System.out.println(i+" Is Not A Prime Number");
                flag=false;
            }
        }

    }
}
