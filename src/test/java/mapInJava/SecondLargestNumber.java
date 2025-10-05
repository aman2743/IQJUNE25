package mapInJava;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int arr[]={49,11,505,19,565,1333,55};
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            } else if ((arr[i]>max2)&&(arr[i]!=max1)) {
             max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
