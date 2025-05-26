import java.util.*;
public class moreopreations {
    public static void getIthBit(int n,int i){
        //for geting ith bit
        int bitmask=1<<i;
        if((n&bitmask)==0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }
    public static void setIthBit(int n,int i){
        //for seting ith bit means if its 0 or 1 we have to make it 1
        int bitmask=1<<i;
        n=(n|bitmask);
        System.out.println(n);
    }
    public static void clearIthBit(int n,int i){
        //for clearing ith bit means if its 0 or 1 we have to make it 0
        int bitmask=~(1<<i);
        n=(n&bitmask);
        System.out.println(n);
    }
    public static void UpdateIthBit(int n,int i, int newbit){
        //updating bit means we have to wether make it clear or we have to set it 
        if(newbit==0){
            clearIthBit(n, i);
        }
        else{
            setIthBit(n, i);
        }
    }
    public static int clearIBits(int n,int i){
        //clear the number of bits given till i
        int bitMask=(~0)<<i;
        return n & bitMask;

    }
    public static int clearIRangeBits(int n,int i,int j){
        //clear the number of bits given in range i and j
        int a=((~0)<<(j+1));
        int b=(1<<i)-1;
        int bitmask=a|b;
        return n&bitmask;
    }
    public static boolean powOf2(int n){
        //check the number is pow of two of not
        return (n&(n-1))==0;
    }
    public static int countSetBits(int n){
        //count numbers of 1 in a number
        int count=0;
        while(n>0){
            if((n&1)!=0){
                count++;
            }
            n=n>>1;
        }
        return count;

    }
    public static int fastexpo(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1)!=0){
                ans=ans*a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        getIthBit(10, 3);
        setIthBit(10, 2);
        clearIthBit(10, 1);
        UpdateIthBit(10,2,1);
        System.out.println(clearIBits(15, 2));
        System.out.println(clearIRangeBits(10, 2, 4));
        System.out.println(powOf2(8));
        System.out.println(countSetBits(16));
        System.out.println(fastexpo(3,5));
    }
}
