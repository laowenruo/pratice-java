import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution3 {
    /* Write Code Here */
    public int number=0;
    public int solution(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j=i+1;j<str.length();j++){
                dfs(str.substring(i,j+1));
            }
        }
        return number;
    }
    public void dfs(String str){
        if (str.length()<2){
            return;
        }
        int n=str.length();
        char[] words=(str+str).toCharArray();
        for (int i = 0; i < n-1; i++) {
            if (words[i]!=words[2*n-i]||words[2*n-i]!=words[2*n+i-2]){
                return;
            }
        }
        number++;
    }
}

public class gowhere_3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        String _str;
        try {
            _str = in.nextLine();
        } catch (Exception e) {
            _str = null;
        }

        res = new Solution3().solution("cdcdsdcdscbaabc");
        System.out.println(String.valueOf(res));

    }
}
