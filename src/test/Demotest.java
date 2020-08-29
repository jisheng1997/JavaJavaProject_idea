package test;

/**
 * @author MrKino
 * @version 1.0
 * @date 2020/8/25 12:20
 */

public class Demotest {
    public static void main(String[]args){
    }

}

class Person{
    int age;
    String name;

    public  void eat(){
        System.out.println("吃饭");
    }

    public  void sleep(){
        System.out.println("睡觉");
    }
}

class Man extends Person{
    boolean isSmoking;

    public void eat(){
        System.out.println("男人吃饭吃得多");
    }

    public  void sleep(){
        System.out.println("男人睡觉睡得少");
    }
}
