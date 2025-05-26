import java.util.*;
public class testpad {
    public static void evenDigits(int n){
        if(n==0){
            return;
        }
        int m=n%10;
        if(m%2==0){
        System.out.print(m);
        }
        evenDigits(n/10);
    }
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        evenDigits(n);
    }
}

