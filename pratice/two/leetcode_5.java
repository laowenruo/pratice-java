package pratice.two;

public class leetcode_5 {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int maxBegin = 0;
        int maxEnd = 0;
        int max = 0;
        for (int i = 0; i < chars.length; i++) {
            int n=i-1;
            int m=i+1;
            int count=0;
            while (n>=0&&chars[n]==chars[i]){
                n--;
                count++;
            }
            while (m< chars.length&&chars[m]==chars[i]){
                m++;
                count++;
            }
            while (n>=0&&m<chars.length&&chars[m]==chars[n]){
                count=count+2;
                n--;
                m++;
            }
            if (count>max){
                maxBegin=n+1;
                maxEnd=m-1;
                max=count;
            }
        }
        return s.substring(maxBegin,maxEnd+1);
    }
}
