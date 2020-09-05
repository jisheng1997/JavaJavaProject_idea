package String;

/**
 * @ClassName : StringTest1
 * @Description :  比较String创建方式的不同
 * @Author : MrKino
 * @Date : 2020/9/2 13:40
 * @Version : 1.0
 **/
public class StringTest1 {

    public static void main(String[] args) {
        String str1 = "JavaEE";
        String str2 = "JavaEE";
        str1.compareTo(str2);

        String str3 = new String("JavaEE");
        String str4 = new String("JavaEE");

        System.out.println(str1 == str2);//true
        System.out.println(str3 == str4);//false

        System.out.println(str1 == str3);//false
        System.out.println(str1 == str4);//false

        //字符串拼接操作


    }
}
