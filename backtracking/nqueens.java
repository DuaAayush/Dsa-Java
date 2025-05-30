import java.util.*;
public class nqueens {
    public static boolean check(char board[][],int row,int col){
        for (int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        for (int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        for (int i=row-1, j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    static int count=0;
    public static void queen(char board[][],int row){
        
        if(row==board.length){
            printboard(board);
            count++;
            return;
        }
        for (int col=0;col<board.length;col++){
            if(check(board,row,col)){
                board[row][col]='Q';
                queen(board, row+1);
                board[row][col]='X';
        }
        }
    }
    public static void printboard(char board[][]){
        System.out.println("--------------chess board--------------");
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        char board[][]=new char[n][n];
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        queen(board,0);
        System.out.println(count);
    }
}
