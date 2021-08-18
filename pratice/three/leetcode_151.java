package three;

/**
 * @author ryan_coder
 */
public class leetcode_151 {
    public String reverseWords(String s) {
        String[] s1 = s.trim().replaceAll("\\s+", " ").split(" ");
        StringBuilder str=new StringBuilder();
        for (int i = s1.length-1; i >= 0; i--) {
            if (i==0){
                str.append(s1[i]);
            }else {
                str.append(s1[i]+" ");
            }
        }
        return str.toString();
    }


}
