package three;

/**
 * @author ryan_coder
 */
public class leetcode_48 {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        //上下交换
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < m; j++) {
                swap(i,j,n-i-1,j,matrix);
            }
        }
        //左右交换
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                swap(i,j,j,i,matrix);
            }
        }
    }
    public void swap(int i,int j,int n,int m,int[][] matrix){
        int temp=matrix[i][j];
        matrix[i][j]=matrix[n][m];
        matrix[n][m]=temp;
    }
}
