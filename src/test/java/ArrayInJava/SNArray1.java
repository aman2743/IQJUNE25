package ArrayInJava;

public class SNArray1 {
    public static void main(String[] args) {
        int arr[][]=new int[3][4];
        int temp=2;
        int len=arr.length;
        System.out.println("Length = "+len);
        for(int i=0;i<len;i++){
            int len1=arr[i].length;
            for(int j=0;j<len1;j++){
                arr[i][j]=temp;
                System.out.print(arr[i][j]+" ");
                temp=temp+2;
            }
            System.out.println();
        }

    }
}
