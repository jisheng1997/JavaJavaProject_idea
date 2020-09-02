package String;

import org.junit.Test;

/**
 * @ClassName : StringMethodTest
 * @Description :   测试字符串常用方法
 * @Author : MrKino
 * @Date : 2020/9/2 16:16
 * @Version : 1.0
 **/
public class StringMethodTest {
    @Test
    public void test1(){
        String str1 = "helloworld";
        //输出字符串的长度
        System.out.println(str1.length());
        //返回指定位置上的字符
        System.out.println(str1.charAt(4));
        //判断字符串是否为空
        System.out.println(str1.isEmpty());
        //字符串大写
        String str2 = str1.toUpperCase();
        System.out.println(str2);
        //去掉首位空白
        String str3 = "   he  llo    wor  ld    ";
        System.out.println(str3.trim());
    }

    @Test
    public void test2(){
        //比较大小，忽略大小写比较大小
        String str1 = "abc";
        String str2 = "ABC";
        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equalsIgnoreCase(str2));//true

        String str3 = "abe";
        System.out.println(str1.compareTo(str3));//负数当前对象小
    }

    @Test
    public void test3(){
        //返回一个截取的字符串
        String str1 = "上海市宝山区";
        System.out.println(str1.length());
        System.out.println(str1.substring(3,str1.length()));
    }

    @Test
    public void test4(){
        String str1 = "abcedf";
        //判断字符串是否以指定后缀结束
        System.out.println(str1.endsWith("df"));
        //判断字符串是否以指定前缀开始
        System.out.println(str1.startsWith("ac"));
        System.out.println(str1.startsWith("ce",2));
    }


}
