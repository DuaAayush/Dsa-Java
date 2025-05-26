import java.util.*;
public class oddoreven {
    public static void oddOrEven(int n){
        int bitMask=1;
        if((n&bitMask)==0){
            System.out.println("Even Number");
        }
        else{
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        oddOrEven(2);
        oddOrEven(3);
        oddOrEven(211);
        oddOrEven(2356);
        oddOrEven(23456789);

    }
}
