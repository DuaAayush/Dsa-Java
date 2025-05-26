import java.util.*;
public class Tiling {
    public static int tilings(int n){
        if(n==0||n==1){
            return 1;
        }
        int tm1=tilings(n-1);
        int tm2=tilings(n-2);
        int total=tm1+tm2;
        return total;
    }
    public static void main(String[] args) {
        int n=2;
        System.out.println(tilings(n));
    }
}
