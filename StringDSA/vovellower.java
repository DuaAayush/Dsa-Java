import java.util.*;
public class vovellower {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println(count);
        String str="Aayush";
        String str1="Dua";
        String str2="Aayush";
        System.out.println(str.equals(str1)+" "+str.equals(str2));
    }
}
