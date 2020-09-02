package thread;

/**
 * @ClassName : TheadTest1
 * @Description :
 * @Author : MrKino
 * @Date : 2020/9/1 19:40
 * @Version : 1.0
 **/
public class ThreadTest1 implements Runnable{
    private int ticket = 100;
    Object object = new Object();

    @Override
    public void run() {
        while(true){
            synchronized (object){//锁
                if (ticket>0){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "：卖票，票号为" + ticket);

                    ticket--;
                }else{
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest1 test11 = new ThreadTest1();

        Thread t1 = new Thread(test11);
        Thread t2 = new Thread(test11);
        Thread t3 = new Thread(test11);

        t1.setName("窗口一");
        t2.setName("窗口二");
        t3.setName("窗口三");

        t1.start();
        t2.start();
        t3.start();


    }
}
