package ArrayInJava;

public class BubbleSortInJava {
    public static void main(String[] args) {
        int arr[]={4,2,9,6,12,1};
        int len=arr.length;
        int temp;
        for(int i=0;i<len;i++){
            for (int j = 1; j <(len-i) ; j++) {
                  if(arr[j-1]<arr[j]){
                      temp=arr[j-1];
                      arr[j-1]=arr[j];
                      arr[j]=temp;
                  }
            }

        }
        for (int j = 0; j <len ; j++) {
            System.out.print(arr[j]+" ");
        }
    }
}
