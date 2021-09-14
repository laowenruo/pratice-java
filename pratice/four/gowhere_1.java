/**
 * @author Ryan
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution {
    /* Write Code Here */
    ArrayList<Integer> list;
    public String solution(int[] d) {
        list=new ArrayList<>();
        boolean[] flag=new boolean[d.length];
        dfs(d,new StringBuilder(""),flag);
        Collections.sort(list,((o1, o2) -> o2-o1));
        for (Integer integer : list) {
            if (integer%3==0){
                return String.valueOf(integer);
            }
        }
        return "";
    }
    public void dfs(int[] d,StringBuilder str,boolean[] visited){
        if (!str.toString().equals("")){
            list.add(Integer.valueOf(str.toString()));
        }
        for (int i = 0; i < d.length; i++) {
            if (visited[i]){
                continue;
            }
            str.append(d[i]);
            visited[i]=true;
            dfs(d, str,visited);
            visited[i]=false;
            str.deleteCharAt(str.length()-1);
        }
    }
}

public class gowhere_1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        int _d_size = 0;
        _d_size = Integer.parseInt(in.nextLine().trim());
        int[] _d = new int[_d_size];
        int _d_item;
        for(int _d_i = 0; _d_i < _d_size; _d_i++) {
            _d_item = Integer.parseInt(in.nextLine().trim());
            _d[_d_i] = _d_item;
        }

        res = new Solution().solution(_d);
        System.out.println(res);
    }
}
