import java.util.ArrayList;
import java.util.List;

public class leetcode_46 {
    private List<List<Integer>> lists;
    public List<List<Integer>> permute(int[] nums) {
        if (nums==null||nums.length==0){
            return lists;
        }
        lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        dfs(nums,list);
        return lists;
    }
    private void dfs(int[] nums,List<Integer> list){
        if (list.size()== nums.length){
            lists.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            dfs(nums, list);
            list.remove(list.size()-1);
        }
    }
}
