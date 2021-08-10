package pratice.two;

import java.util.Stack;

public class leetcode_20 {
    public boolean isValid(String s) {
        if (s==null||"".equals(s)){
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]==')'&&stack.peek()=='('){
                stack.pop();
            }else if (chars[i]==']'&&stack.peek()=='['){
                stack.pop();
            }else if (chars[i]=='}'&&stack.peek()=='{'){
                stack.pop();
            }else {
                stack.push(chars[i]);
            }
        }
        if (stack.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
