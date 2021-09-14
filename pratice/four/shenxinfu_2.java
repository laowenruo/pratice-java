public class shenxinfu_2 {
    public String reverseWords (String s, int i) {
        // write code here
        String[] words = s.split(" ");
        reverse(words,0,i-1);
        reverse(words,i, words.length-1);
        StringBuilder str=new StringBuilder();
        for (int i1 = 0; i1 < words.length; i1++) {
            if (i1== words.length-1){
                str.append(words[i1]);
                return str.toString();
            }
            str.append(words[i1]+" ");
        }
        return "";
    }
    public void reverse(String[] words,int n,int m){
        int i=n,j= m;
        while (i<j){
            swap(words,i++,j--);
        }
    }
    public void swap(String[] words,int i,int j){
        String temp=words[i];
        words[i]=words[j];
        words[j]=temp;
    }

    public static void main(String[] args) {
        shenxinfu_2 shenxinfu_2 = new shenxinfu_2();
        System.out.println(shenxinfu_2.reverseWords("I am a student.", 2));
    }
}
