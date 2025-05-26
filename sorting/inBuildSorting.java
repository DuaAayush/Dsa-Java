import java.util.*;
public class inBuildSorting {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printobj(Integer arr2[]){
        for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,1,1,8,2};
        Arrays.sort(arr);
        
        Arrays.sort(arr,0,4);
        // now using collection framework for doing descending order 
        // we cant use int primitive data type wee need an object so 
        Integer arr2[]={3,4,1,24,2,4,2,123,45,1,8,4,2,4};
        Arrays.sort(arr2,Collections.reverseOrder());
        print(arr);
        printobj(arr2);
    }
}
