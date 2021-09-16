public class music_2 {
    public static void main(String[] args) {
        System.out.println(new music_2().maxLexicographical("101001"));
    }
    public String maxLexicographical (String num) {
        // write code here
        char[] chars = num.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]=='0'){
                while (i< chars.length&&chars[i]=='0'){
                    chars[i]='1';
                    i++;
                }
                break;
            }
        }
        String number=new String(chars);
        return number;
    }
}
