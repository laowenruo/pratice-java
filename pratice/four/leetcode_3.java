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
    public int lengthOfLongestSubstring1(String s){
        char[] words=s.toCharArray();
        HashMap<Character, Integer> map=new HashMap<>(words.length);
        int maxLength=Integer.MIN_VALUE;
        for (int start=0,end = 0; end < words.length; end++) {
            if (map.containsKey(words[end])){
                start=Math.max(start,map.get(words[end]));
            }
            maxLength=Math.max(maxLength,end-start+1);
            start=map.get(words[end]);
            map.put(words[end],end+1);
        }
        return maxLength;
    }
}
