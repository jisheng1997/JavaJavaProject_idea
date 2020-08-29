package oop.exer1;

/**     考察多态的笔试题目
 * @author MrKino
 * @Description
 * @date 2020/8/28 22:13
 */
public class InterviewTest1 {
    public static void main(String[] args) {
        Base base = new Sub();
        //调用父类中被子类重写的方法
        base.add(1,2,3);
        Sub s = (Sub)base;
        //调用子类中特定的方法
        s.add(1,2,3);
    }
}

class Base{
    public void add(int a,int...arr){
        System.out.println("base");
    }
}

class Sub extends Base{
    public void add(int a,int[]arr){
        System.out.println("sub_1");
    }

    public void add(int a,int b,int c){
        System.out.println("sub_2");
    }
}
