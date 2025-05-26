import java.util.*;
public class sum2row {
    public static void sum(int mat[][]){
        int sum=0;
        for(int i=0;i<mat[2].length;i++){
            sum+=mat[2][i];

        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        int mat[][]={{1,4,9},{11,4,3},{2,2,3}};
        sum(mat);
    }
}
