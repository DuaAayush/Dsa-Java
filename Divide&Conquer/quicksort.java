import java.util.*;
public class quicksort {
    public static void quick(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int pidx=partition(arr, si, ei);
        quick(arr, si, pidx-1);
        quick(arr,pidx+1,ei);
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i =si-1;
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            }
            
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={9,4,6,3,7,2,8,3,4,2,-2};
        quick(arr, 0, arr.length-1);
        print(arr);
    }
}
