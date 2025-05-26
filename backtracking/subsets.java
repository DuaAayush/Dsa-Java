import java.util.*;
public class subsets {
    public static void findsubsets(String str,int i,String newstr){
        if(i==str.length()){
            if(newstr.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(newstr);
            }
            return ;
        }
        findsubsets(str, i+1, newstr);
        findsubsets(str, i+1,newstr+str.charAt(i));
    }
    public static void main(String[] args) {
        String str="abc";
        findsubsets(str, 0, "");
    }
}
