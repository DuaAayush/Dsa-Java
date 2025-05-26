import java.util.*;

public class firsttoupper {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb);
        sb.setCharAt(0,Character.toUpperCase(sb.charAt(0)));
        for (int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' ' && i+1!=sb.length()){
                sb.setCharAt(i+1,Character.toUpperCase(sb.charAt(i+1)));
            }
        }
        System.out.println(sb);
        }
        
    }   

