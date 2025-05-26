import java.util.*;
public class binarySearch5 {
    public static int binary(int arr[],int key){
        int start=0;int end=arr.length;
        while(start<=end){
            int mid=(start+end)/2;
            //comparisons
            if (arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
   public static void main(String[] args) {
    int arr[]={1,3,2,5,3,56,7,4,123};
    int key=1;
    int index=binary(arr,key);
    System.out.println(index);
   } 
}
