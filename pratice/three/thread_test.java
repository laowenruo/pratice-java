package three;

/**
 * @author ryan_coder
 */
public class thread_test {
    static class test implements Runnable{
        Object lock;
        Object lock1;
        String str;
        public test(Object lock,Object lock1,String str){
            this.lock=lock;
            this.str=str;
            this.lock1=lock1;
        }
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                synchronized (lock){
                    synchronized (lock1){
                        System.out.print(str);
                        lock1.notifyAll();
                    }
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        Object A=new Object();
        Object B=new Object();
        Object C=new Object();
        new Thread(new test(C,A,"A")).start();
        new Thread(new test(A,B,"B")).start();
        new Thread(new test(B,C,"C")).start();
    }
}
