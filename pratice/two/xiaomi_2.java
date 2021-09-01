import java.util.LinkedList;
import java.util.Scanner;

public class xiaomi_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        LinkedList<Integer> linkedList=new LinkedList<>();
        int count=0;
        for (int i = 1; i <=n; i++) {
            if (count==3){
                count=0;
                linkedList.pollLast();
            }
            linkedList.add(i);
            count++;
        }
        while (linkedList.size()!=1){
            if (count==3){
                count=0;
                linkedList.pollLast();
            }
            linkedList.add(linkedList.pollFirst());
            count++;
        }
        System.out.println(linkedList.get(0));
    }
}
