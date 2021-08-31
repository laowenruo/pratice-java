import java.util.ArrayList;
import java.util.List;

/**
 * @author Ryan
 */
public class leetcode_78 {
    public List<List<Integer>> lists;
    public List<List<Integer>> subsets(int[] nums) {
        if (nums==null||nums.length==0){
            return lists;
        }
        lists=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        dfs_subsets(nums,0,list);
        return lists;
    }
    public void dfs_subsets(int[] nums,int start,List<Integer> list){
        if (start>= nums.length){
            return;
        }
        lists.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            dfs_subsets(nums, start+1, list);
            list.remove(list.size()-1);
        }
    }
}
