import java.util.*;
public class maxSubarray {
    public static void MaxSub(int arr[]){
        int max=Integer.MIN_VALUE;
        int curr=0;
        for (int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
               int end=j;
               curr=0;
               for(int k=start;k<=end;k++){
               curr+=arr[k];
               }
               if(curr>max){
                max=curr;
               }
            }
        }
        System.out.println("Maximum element"+max);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        MaxSub(arr);
    }
}
