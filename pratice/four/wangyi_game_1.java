import java.util.Scanner;
import java.util.Stack;

public class wangyi_game_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a= in.nextInt();
        while (a--!=0){
            int temp= in.nextInt();
            System.out.println(toNum(temp));
        }
    }
    public static String toNum(int num){
        char[] chars = String.valueOf(num).toCharArray();
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            str.append(processNum(chars[i]));
        }
        char[] words = str.reverse().toString().toCharArray();
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < words.length; i++) {
            if (stack.isEmpty()&&words[i]=='0'||!stack.isEmpty()&&(stack.peek()=='1'&&words[i]=='1'||stack.peek()=='0'&&words[i]=='0')){
                continue;
            }
            else {
                stack.push(words[i]);
            }
        }
        char[] result = new char[stack.size()];
        int index=0;
        while (!stack.isEmpty()){
            result[index++]=stack.pop();
        }
        str=new StringBuilder(String.valueOf(result));
        return str.reverse().toString();
    }
    public static String processNum(char word){
        Integer num=Integer.valueOf(word)-48;
        if (num==0){
            return "0";
        }
        StringBuilder str=new StringBuilder();
        while (num!=0){
            str.append(num%2);
            num=num/2;
        }
        return str.reverse().toString();
    }
}
