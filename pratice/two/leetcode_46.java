package pratice.two;

import java.util.ArrayList;
import java.util.List;

public class leetcode_46 {
    List<List<Integer>> lists;
    public List<List<Integer>> permute(int[] nums) {
        lists=new ArrayList<>();
        if (nums==null||nums.length==0){
            return null;
        }
        List<Integer> list=new ArrayList<>();
        dfs(nums,list);
        return lists;
    }
    public void dfs(int[] nums,List<Integer> list){
        if (list.size()== nums.length){
            lists.add(new ArrayList<>(list));
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i])){
                continue;
            }
            list.add(nums[i]);
            dfs(nums,list);
            list.remove(list.size()-1);
        }
    }
}
