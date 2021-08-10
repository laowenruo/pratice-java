package pratice.two;

public class leetcode_415 {
    public String addStrings(String num1, String num2) {
        int n=num1.length()-1;
        int m=num2.length()-1;
        StringBuilder str=new StringBuilder();
        int add=0;
        while (n>=0||m>=0||add!=0){
            int a=n>=0?num1.charAt(n)-'0':0;
            int b=m>=0?num2.charAt(m)-'0':0;
            int sum=a+b+add;
            str.append(sum%10);
            add=sum/10;
            n--;m--;
        }
        str.reverse();
        return str.toString();
    }
}
