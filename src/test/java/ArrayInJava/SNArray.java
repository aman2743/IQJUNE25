package ArrayInJava;

public class SNArray {
    public static void main(String[] args) {
//        int arr[][]=new int[3][3];
        int arr[][]={  {2,4,6}  ,  {8,10,12}  ,  {14,16,18}    };
        int len=arr.length;
        System.out.println("Length = "+len);
        for(int i=0;i<len;i++){
            int len1=arr[i].length;
            for(int j=0;j<len1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
