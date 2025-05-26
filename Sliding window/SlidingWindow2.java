import java.util.*;
public class SlidingWindow2 {
    public int findMaxLength(int[] arr,int target){
        int left=0;int right=0;int sum=0;int maxLength=0;
        int start=0;
        for (right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>target){
                sum-=arr[left];
                left++;
            }
            if (right-left+1>maxLength){
                maxLength=right-left+1;
                start=left;
            }
        }
        for(int i=start;i<start+maxLength;i++){
            System.out.println(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        
    }
}
