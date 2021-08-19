package three;

/**
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * @author ryan_coder
 */
public class leetcode_76 {
    public String minWindow(String s, String t) {
        if (s==null||t==null||s.length()==0||t.length()==0){
            return null;
        }
        int[] nums=new int[128];
        char[] words=t.toCharArray();
        for (int i = 0; i < words.length; i++) {
            nums[words[i]]++;
        }
        char[] chars = s.toCharArray();
        int left=0,start=0,right=0,size=Integer.MAX_VALUE,count=t.length();
        while (right<s.length()){
            if (nums[chars[right]]>0){
                count--;
            }
            nums[chars[right]]--;
            if (count==0){
                while (left<right&&nums[chars[left]]<0){
                    nums[chars[left]]++;
                    left++;
                }
                if (right-left+1<size){
                    size=right-left+1;
                    start=left;
                }
                nums[chars[left]]++;
                left++;
                count++;
            }
            right++;
        }
        return size == Integer.MAX_VALUE ? "" : s.substring(start, start + size);
    }
}
