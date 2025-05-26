public class transpose1 {
    public static void transpose(int mat[][]){
        int tmat[][]=new int[mat[0].length][mat.length];
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                tmat[j][i]=mat[i][j];
            }
        }
        for (int i=0;i<tmat.length;i++){
            for (int j=0;j<tmat[i].length;j++){
                System.out.print(tmat[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int mat[][]={{1,2,3},
                    {4,5,6}};
        transpose(mat);
    }
}
