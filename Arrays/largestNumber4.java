import java.util.*;
public class largestNumber4{
    public static void main(String args[]){
        int arr[]={1,3,2,4,89,123456,65,32,234,12345};
        int max=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }

        }
        System.out.println(max);
    }
}