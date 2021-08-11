package two;

/**
 * @author ryan_coder
 */
public class thread_test {
    static class test implements Runnable{
        Object object;
        String str;
        public test(Object object,String str){
            this.object=object;
            this.str=str;
        }
        @Override
        public void run() {
            for (int i = 0; i < 2; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (object){
                    System.out.println(str);
                }
            }
        }

    }

    public static void main(String[] args) {
        Object lock=new Object();

        new Thread(new test(lock,"A")).start();
        new Thread(new test(lock,"B")).start();
        new Thread(new test(lock,"C")).start();
    }
}
