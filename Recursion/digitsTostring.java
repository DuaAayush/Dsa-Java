import java.util.*;
public class digitsTostring {
    static String digits[] = {"zero", "one", "two", "three", "four", "five", "six","seven", "eight", "nine"};
    public static void printdigit(int n){
        if(n==0){
            return;
        }
        int last=n%10;
        printdigit(n/10);
        System.out.print(digits[last]+" ");
    }
    public static void main(String[] args) {
        printdigit(2453647);
    }
}
