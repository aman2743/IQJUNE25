package ArrayInJava;

public class SxArray {
    public static void main(String[] args) {
     int arr[]=new int[10];
     int len=arr.length;
        System.out.println("Length = "+len);
     int temp=2;

     for(int i=0;i<len;i++){
         System.out.println(arr[i]=temp);
         temp=temp+2;

     }

    }
}
