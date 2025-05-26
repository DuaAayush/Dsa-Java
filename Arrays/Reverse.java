import java.util.*;
public class Reverse {
    public static void reverse(int arr[]){
        int start=0,end=arr.length-1;
        while(start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
       
    }
    public static void main(String[] args) {
        int arr[]={12,3,21,3,4,31,45,2,324,21};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
