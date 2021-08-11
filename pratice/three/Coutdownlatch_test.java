package three;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ryan_coder
 */
public class Coutdownlatch_test {
    static class A implements Runnable{
        CountDownLatch latch;
        public A(CountDownLatch latch){
            this.latch=latch;
        }

        @Override
        public void run() {
            System.out.println("哈哈哈");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            latch.countDown();
        }
    }
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.execute(new A(latch));
        executorService.execute(new A(latch));
        executorService.execute(new A(latch));
        Long time = System.currentTimeMillis();
        try {
            latch.await();
            time = System.currentTimeMillis() - time;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("执行时间" + time);
        executorService.shutdown();
    }
    }
