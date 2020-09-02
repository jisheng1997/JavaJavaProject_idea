package oop;

/**
 * @author MrKino
 * @Description 单例模式的两种写法
 * @date 2020/8/29 22:02
 */

public class SingletonTest {
    public static void main(String[] args) {
        Order1 order1 = Order1.getInstance();
        Order2 order2 = Order2.getInstance();
    }
}

//饿汉式
class Order2{
    //私有化构造器
    private Order2(){}

    //创建类对象
    private static Order2 instance = new Order2();
    //声明返回当前类对象的方法
    public static Order2 getInstance(){
        return instance;
    }
}

//懒汉式（线程不安全）
class Order1{
    //私有化构造器
    private Order1(){}

    //声明当前类对象，没有初始化，且为static的
    private static Order1 instance = null;
    //声明返回当前类对象的方法
    public static Order1 getInstance() {
        if (instance == null){
            synchronized (Order1.class) {
                if (instance == null) {
                    instance = new Order1();
                }
            }
        }return instance;
    }
}