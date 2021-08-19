package three;

import java.util.Random;

public class leetcode_470  {
    public int rand10() {
        int x=(rand7()-1)*7+rand7();
        while (x>40){
            x=(rand7()-1)*7+rand7();
        }
        return 1 + x % 10;
    }
    public int rand7(){
        int m=new Random().nextInt(8);
        while (m==0){
            m=new Random().nextInt(8);
        }
        return m;
    }
}
