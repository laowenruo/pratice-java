package three;

import java.util.concurrent.atomic.AtomicInteger;

public class thread_test1 {
    public static volatile AtomicInteger state=new AtomicInteger(0);
    public static volatile int count=0;

    static class test implements Runnable {
        String str;
        int expectedValue;
        int newValue;
        int nums=10;
        public test(int expectedValue, int newValue, String str) {
            this.expectedValue = expectedValue;
            this.newValue = newValue;
            this.str = str;
        }

        @Override
        public void run() {
            while (true&&nums!=0) {
                while (count==this.expectedValue) {
                    System.out.print(str);
                    count=this.newValue;
                    nums--;
                }
            }
        }
    }
    public static void main(String[] args) {
        new Thread(new test(0,1,"A")).start();
        new Thread(new test(1,2,"B")).start();
        new Thread(new test(2,0,"C")).start();

    }
}
