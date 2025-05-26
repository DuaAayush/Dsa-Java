import java.util.*;
public class gridways {
    public static int grid2(int n,int m){
        n=n-1;
        m=m-1;
        int o=n+m;
        int k=1;
        for (int i=o;i>=1;i--){
            k=k*i;
        }
        int g=1;
        for(int i=n;i>=1;i--){
            g=g*i;
        }
        int h=1;
        for(int i=m;i>=1;i--){
            h=h*i;
        }
        int l=h*g;
        int q=k/l;
        return q;
    }
    public static int grid(int i,int j,int n,int m){
        if(i==n-1 && j==m-1){
            return 1;
        }
        else if(i==n||j==n){
            return 0;
        }
        int c1=grid(i+1,j,n,m);
        int c2=grid(i,j+1,n,m);
        return c1+c2;
    }
    public static void main(String[] args) {
        int n=10,m=10;
        System.out.println(grid(0,0,n,m));
        System.out.println(grid2(7,3));
    }
}
