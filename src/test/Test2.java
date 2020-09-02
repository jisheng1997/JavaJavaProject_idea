package test;

/**
 * @ClassName : test2
 * @Description :  类，实例化对象调用问题
 * @Author : MrKino
 * @Date : 2020/9/1 21:30
 * @Version : 1.0
 **/
public class Test2 {
    String string1 = "我是一个成员变量";
    static String string2 = "我是一个静态变量";

    public void method1(){
        System.out.println("我是一个默认方法");
    }

    public static void method2(){
        System.out.println("我是一个静态方法");
    }

    public static void main(String[] args) {
        //类调用成员变量   System.out.println(Test2.string1); 不行

        //类调用静态变量
        System.out.println(Test2.string2);

        Test2 test2 = new Test2();

        //对象调用成员变量
        System.out.println(test2.string1);

        //对象调用静态变量
        System.out.println(test2.string2);

        //类调用默认方法  Test2.method1();   不行

        //对象调用默认方法
        test2.method1();

        //类调用静态方法
        Test2.method2();

        //对象调用静态方法
        test2.method2();
    }
}
