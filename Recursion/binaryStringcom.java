import java.util.*;
public class binaryStringcom {
    public static void printcom(int n,int last,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printcom(n-1, 0, str+"0");
        if(last==0){
            printcom(n-1, 1, str+"1");
        }
    }
   public static void main(String[] args) {
        printcom(3, 0, "");
   } 
}
