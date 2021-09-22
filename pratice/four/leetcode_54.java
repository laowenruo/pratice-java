import java.util.ArrayList;
import java.util.List;

public class leetcode_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;
        while (left<=right&&top<=bottom){
            for (int i=left;i<=right;i++){
                list.add(matrix[top][i]);
            }
            for (int i=top+1;i<=bottom;i++){
                list.add(matrix[i][right]);
            }
            if (right!=left){
                for (int i=right-1;i>=left;i--){
                    list.add(matrix[bottom][i]);
                }
            }
            if (bottom!=top){
                for (int i=bottom-1;i>=top;i--){
                    list.add(matrix[i][left]);
                }
            }
            top++;bottom--;left++;right--;
        }
        return list;
    }
}
