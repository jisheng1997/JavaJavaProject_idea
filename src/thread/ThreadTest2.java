package thread;

/**
 * @ClassName : ThreadTest2
 * @Description :  使用两个线程打印1-100，线程1，线程2，交替打印
 * @Author : MrKino
 * @Date : 2020/9/2 9:45
 * @Version : 1.0
 **/
public class ThreadTest2 {
    public static void main(String[] args) {
        Number number = new Number();
        Thread t1 = new Thread(number);
        Thread t2 = new Thread(number);
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();
    }



}

class Number implements Runnable{
    private int number = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {//number对象
                notify();//唤醒阻塞的线程
                if (number <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + number);
                    number++;

                    try {
                        wait();//阻塞线程，释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
