package mapInJava;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[]={49,11,55,19,55,13,55};
        int x=arr[0];// Assume this is the highest number
        int y=0;
        for(int i=1;i<=4;i++){
            y=arr[i];
            if(y>x){
                x=y;
            }
        }
        System.out.println(x);
    }
}
