import java.util.*;
public class count7 {
    public static int count(int mat[][],int digit){
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if (mat[i][j]==digit){
                    count ++;
                }

            }
        }
        return count;
    }
    public static void main(String[] args) {
        int mat[][]={{4,7,8},
                    {8,8,7}};
                    int digit=8;
        int c=count(mat,digit);
        System.out.println(c);
    }
}
