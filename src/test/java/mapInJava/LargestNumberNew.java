package mapInJava;

public class LargestNumberNew {
    public static void main(String[] args) {
        int arr[]={49,11,55,19,55,133,55};
        int max=Integer.MIN_VALUE;
        int len=arr.length;
        for(int i=0;i<len;i++){
             if(arr[i]>max){
                 max=arr[i];
             }
            }
        System.out.println(max);
    }
}
