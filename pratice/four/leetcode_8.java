public class leetcode_8 {
    public int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int n=chars.length;
        int idx=0;
        while (idx<n&&chars[idx]==' '){
            idx++;
        }
        if (idx==n){
            return 0;
        }
        boolean flag=false;
        if (chars[idx]=='-'){
            flag=true;
            idx++;
        }else if (chars[idx]=='+'){
            idx++;
        }else if (!Character.isDigit(chars[idx])){
            return 0;
        }
        int ans=0;
        while (idx<n&&Character.isDigit(chars[idx])){
            int digit=chars[idx]-'0';
            if (ans>(Integer.MAX_VALUE-digit)/10){
                return flag?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            ans=ans*10+digit;
            idx++;
        }
        return flag?-ans:ans;
    }
}
