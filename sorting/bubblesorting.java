import java.util.*;
public class bubblesorting {
    public static void bubble(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int swap=0;
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                
            }
            if (swap==0){
                
                break;
            }
            
        }
    }
    public static void printarr(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,2,4,2,1,9,7,3,5,1};
        bubble(arr);
        printarr(arr);
    }
}
