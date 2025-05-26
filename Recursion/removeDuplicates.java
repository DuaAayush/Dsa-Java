import java.util.*;
public class removeDuplicates {
    public static void removedup(String str,int idx,StringBuilder newStr,boolean map[]){
        if (idx==str.length()){
            
            System.out.print(newStr);
            return;
        }
        char current=str.charAt(idx);
        if(map[current-'a']==true){
        removedup(str, idx+1, newStr, map);
        }
        else{
            map[current-'a']=true;
            removedup(str, idx+1, newStr.append(current), map);
        }
    }
    public static void main(String[] args) {
        String str="abcdaabbccefghijkklmnopqrstuvwxyzssddgrwsknk";
        removedup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
