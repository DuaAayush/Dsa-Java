import java.util.*;

public class StringCompression {
    public static StringBuilder compres(StringBuilder str){
        StringBuilder compressed = new StringBuilder();
        for (int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            
            compressed.append(str.charAt(i));
            if(count>1){
                compressed.append(count);
            }
        }
        return compressed;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s1=new String("");
        StringBuilder str=new StringBuilder(s);
        // for (int i=0;i<s.length();i++){
        //     Integer count=0;
        //     while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
        //         count++;
        //         i++;
        //     }
        //     s1+=s.charAt(i);
        //     if(count>1){
        //         s1+=count.toString();
        //     }
        // }
        System.out.println(compres(str));
    }    
}
