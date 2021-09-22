public class leetcode_200 {
    public int numIslands(char[][] grid) {
        int num=0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j]=='1'){
                    dfs(grid,i,j);
                    num++;
                }
            }
        }
        return num;
    }
    public void dfs(char[][] grid,int i,int j){
        if (i<0||j<0||i>=grid[i].length||j>=grid.length||grid[i][j]=='0'||grid[i][j]=='2'){
            return;
        }
        grid[i][j]='2';
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
    }
}
