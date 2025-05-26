
import java.util.*;
public class stringsbasics {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static String substring(String str,int a,int b){
        String sub="";
        for(int i=a;i<b;i++){
            sub+=str.charAt(i);
        }
        return sub;
    }
    public static void main(String[] args) {
        // char arr[]={'a','n','c'};
        // String str="abcd";
        // String str2=new String("dnkaobfci3");
        // Scanner sc=new Scanner(System.in);
        // String name=sc.next();
        // System.out.println(name);
        // String Fullname=sc.nextLine();
        // System.out.println(Fullname);
        // String firstname="Aayush";
        // String lastName="Dua";
        // String FULLNAME=firstname+" "+lastName; //Concatination
        // System.out.println(FULLNAME);
        // System.out.println(FULLNAME.charAt(1));
        // printLetters(FULLNAME);
        // String a="abc";
        // String b="abc";
        // String c=new String("abc");
        // if (a==b){
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("Not equal");
        // }
        // if(a==c){
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("Not equal");
        // }
        // if(c.equals(a)){
        //     System.out.println("equal");
        // }
        // else{
        //     System.out.println("Not equals");
        // }

        String str="HelloWorld";
        String sub=substring(str,0,5);
        System.out.println(sub);
    }
}
