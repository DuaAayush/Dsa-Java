import java.util.*;
public class permutation {
    public static void permutation(String str,String newstr){
        if(str.length()==0){
            System.out.println(newstr);
            return;
        }
        for (int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStrings=str.substring(0, i)+str.substring(i+1);
            permutation(newStrings, newstr+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        permutation(str,"");
    }
}
