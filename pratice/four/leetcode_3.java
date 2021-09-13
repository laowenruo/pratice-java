import java.util.HashMap;

public class leetcode_3 {
    public int lengthOfLongestSubstring(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> map=new HashMap<>(s.length());
        int max=0;
        for (int start = 0,end = 0; end < chars.length; end++) {
            if (map.containsKey(chars[end])) {
                start = Math.max(start, map.get(chars[end]));
            }
            map.put(chars[end], end + 1);
            max = Math.max(max, end - start + 1);
        }
        return max;
    }
}
