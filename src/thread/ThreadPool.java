package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName : ThreadPool
 * @Description :  使用线程池
 * @Author : MrKino
 * @Date : 2020/9/2 12:57
 * @Version : 1.0
 **/
public class ThreadPool {
    public static void main(String[] args) {
        //1.提供指定线程数量的线程池
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        //2.执行指定的线程的操作，需要提供实现Runnable或Callable接口实现类的对象
        executorService.execute(new NumberThread());//适合用于Runnable
        executorService.execute(new NumberThread1());
        //executorService.submit();//适合用于Callable
        //3，关闭线程池
        executorService.shutdown();
    }
}

class NumberThread implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class NumberThread1 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}
