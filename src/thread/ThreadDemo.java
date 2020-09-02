package thread;

/**
 * @ClassName : ThreadDemo
 * @Description : 创建两个不同的线程，遍历输出奇数和偶数
 * @Author : MrKino
 * @Date : 2020/9/1 15:12
 * @Version : 1.0
 **/
public class ThreadDemo {
    public static void main(String[] args) {
        Thread t1 = new Thread1();
        Thread t2 = new Thread2();
        //创建thread匿名子类
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2==0){
                        System.out.println(getName() + ":" + getPriority() + ":" + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i%2!=0){
                        System.out.println(getName() + ":" + getPriority() + ":" + i);
                    }
                }
            }
        }.start();
    }


}

class Thread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0){
                System.out.println(getName() + ":" + getPriority() + ":" + i);
            }
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2!=0){
                System.out.println(getName() + ":" + getPriority() + ":" + i);
            }
        }
    }
}