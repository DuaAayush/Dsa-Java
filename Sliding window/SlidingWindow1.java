import java.util.*;
public class SlidingWindow1{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int [n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=0,b=0,sum=0,ans=Integer.MIN_VALUE;
        while(b<k){
            sum+=arr[b];
            b++;
        }
        ans=sum;
        while(b<n){
            sum+=arr[b]-arr[a];
            if(sum>ans){
                ans=sum;
            }
            a++;
            b++;
        }
        System.out.println(ans);
        
    }
}