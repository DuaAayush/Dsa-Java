import java.util.*;
public class BtOnArrays {
    public static void arraybacktrack(int arr[],int i,int n){
        if(i==arr.length){
            printarray(arr);
            return;
        }
        arr[i]=n;
        arraybacktrack(arr, i+1, n+1);
        arr[i]=arr[i]-2;
    }
    public static void printarray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        arraybacktrack(arr,0,1);
        printarray(arr);
    }
}
