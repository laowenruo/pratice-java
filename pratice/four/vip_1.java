import java.util.Arrays;

public class vip_1 {
    public static int[] words=new int[26];
    public int maxSum (String[] words) {
        int max=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                max=Math.max(max,noRepeat(words[i],words[j]));
            }
        }
        return max;
    }
    public int noRepeat(String temp,String temp1){
        int max=0;
        char[] one=temp.toCharArray();
        char[] two=temp1.toCharArray();
        for (int i = 0; i < one.length; i++) {
            words[one[i]-'a']++;
        }
        for (int i = 0; i < two.length; i++) {
            words[two[i]-'a']++;
        }
        for (int i = 0; i < words.length; i++) {
            if (words[i]==1){
                max++;
            }
        }
        Arrays.fill(words,0);
        return max;
    }

    public static void main(String[] args) {
        new vip_1().maxSum(new String[]{"a","aba","abc","d","cd","bcd","abcd"});
    }
}
