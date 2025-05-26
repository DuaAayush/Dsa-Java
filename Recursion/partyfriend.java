import java.util.*;
public class partyfriend {
    public static int ways(int n){
        if(n==1||n==2){
            return n;
        }
        int single=ways(n-1);
        int ouble=ways(n-2);
        ouble=(n-1)*ouble;
        int way=single+ouble;
        return way;
    }
    public static void main(String[] args) {
        int n=3;
        System.out.println(ways(n));
    }
}
