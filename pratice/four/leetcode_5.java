public class leetcode_5 {
    public String longestPalindrome(String s) {
        char[] words=s.toCharArray();
        int maxLeft=0;
        int maxRight=0;
        int length=0;
        int count=0;
        for (int i = 0; i < words.length; i++) {
            int left=i-1;
            int right=i+1;
            count=0;
            while (left>=0&&words[left]==words[i]){
                count++;
                left--;
            }
            while (right< words.length&&words[right]==words[i]){
                count++;
                right++;
            }
            while (left>=0&&right< words.length&&words[left]==words[right]){
                left--;
                right++;
                count=count+2;
            }
            if (count>length){
                maxLeft=left+1;
                maxRight=right-1;
                length=count;
            }
        }
        return s.substring(maxLeft,maxRight+1);
    }
}
