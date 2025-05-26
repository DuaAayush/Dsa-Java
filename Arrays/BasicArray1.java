import java.util.*;
public class BasicArray1{
    public static void main(String args[]){
        int marks[]=new int[100];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("phy"+marks[0]);
        System.out.println("chem"+marks[1]);
        System.out.println("math"+marks[2]);
        int sum=marks[0]+marks[1]+marks[2];
        System.out.println("Sum"+sum);
        int percentage=(marks[0]+marks[1]+marks[2])/3;
        System.out.println("percentage"+percentage);
        System.out.println("array length is "+marks.length);
    }
}
