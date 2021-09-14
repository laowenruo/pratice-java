import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Solution1 {
    /* Write Code Here */
    public int solution(int[] arr) {
        Arrays.sort(arr);
        int n=arr.length;
        int a=arr[n-1]*3+arr[n-2]*2+arr[n-3]*1;
        int index=findZero(arr);
        boolean flag=false;
        if (arr[index]==0){
            flag=true;
        }
        int b=arr[0]*3+arr[1]*2+(flag?0:arr[2]*1);
        int c=arr[n-1]*3+arr[0]*1+(flag?0:arr[1]*2);
        int d=arr[n-1]*3+arr[n-2]*2+(flag?0:arr[0]*1);
        return Math.max(Math.max(a,b),Math.max(c,d));
    }
    public int findZero(int[] arr){
        int i=0;
        int j=arr.length;
        while (i<j){
            int mid=i+(j-i)/2;
            if (arr[mid]==0){
                return mid;
            }else if (arr[mid]>0){
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        return i;
    }
}

public class gowhere_2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;

        int _arr_size = 0;
        _arr_size = Integer.parseInt(in.nextLine().trim());
        int[] _arr = new int[_arr_size];
        int _arr_item;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
            _arr_item = Integer.parseInt(in.nextLine().trim());
            _arr[_arr_i] = _arr_item;
        }

        res = new Solution1().solution(_arr);
        System.out.println(String.valueOf(res));

    }
}
