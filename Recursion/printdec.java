import java.util.*;
public class printdec {
    public static void printdecreasing(int n){
        //printing numbers in decreasing order
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.print(n+" ");
        printdecreasing(n-1);
    }
    public static void printincreasing(int n){
        //printing numbers in increasing order
        if(n==1){
            System.out.print(1+" ");
            return;
        }
        printincreasing(n-1);
        System.out.print(n+" ");
    }
    public static int factorial(int n){
        //calculating facorial of a number using recursion
        if (n==0){
            return 1;
        }
        int factn1=factorial(n-1);
        int factn=n*factn1;
        return factn;
    }
    public static int sum(int n){
        //calculating sum of  n numbers
        if(n==1){
            return 1;
        }
        int sum1=sum(n-1);
        int sum=sum1+n;
        return sum;
    }
    public static int fibonacci(int n){
        //calculationg fibbonaci
        if(n==1){
            return 1;
        }
        if (n==0){
            return 0;
        }
        int fibn1=fibonacci(n-1);
        int fibn2=fibonacci(n-2);
        int fib=fibn1+fibn2;
        
        return fib;
    }
    public static boolean issorted(int arr[],int i){
        //check if the array is sorted or not
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
    public static int firstoccurence(int arr[],int key,int i){
        //first occurence 
        if (i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }
    public static int lastoccurence(int arr[],int key,int i){
        //last occurence
        if (i==arr.length){
            return -1;
        }
        int isfound=lastoccurence(arr, key, i+1);
        if((isfound)==-1 &arr[i]==key){
            return i;
        }
        return isfound;
    }
    public static int xpowern(int x,int n){
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
        int pown1=xpowern(x, n-1);
        int power=x*pown1;
        return power;
    }
    public static int optimizedpower(int x,int n){
        if(n==0){
            return 1;
        }
        // int halfpower=optimizedpower(x, n/2)*optimizedpower(x, n/2);
        int halfpower=optimizedpower(x, n/2);
        int halfpow=halfpower*halfpower;
        if(n%2!=0){
            halfpow=halfpow*x;
        }
        return halfpow;
    }
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // printdecreasing(n);
        // printincreasing(n);
        // System.out.println();
        // System.out.println("factorial of n "+factorial(n));
        // System.out.println("Sum of n natural numbers is "+sum(n)); 
        // System.out.println("fibbonaci of a number n is "+fibonacci(n));
        
        int arr[]={5,6,7,8,9,6,4,3,5,5,5,5,5,5,6,4,3};
        int key=5;
        int i =0;
        System.out.println(issorted(arr, i));
        System.out.println(firstoccurence(arr, key, i));
        System.out.println(lastoccurence(arr, key, i));
        int n=10;
        int x=2;
        System.out.println(xpowern(x, n));
        System.out.println(optimizedpower(x, n));
    }
}
