package String;

import org.junit.Test;

/**
 * @ClassName : StringBufferTest
 * @Description :  StringBuffer（Builder）的常用方法
 * @Author : MrKino
 * @Date : 2020/9/2 19:41
 * @Version : 1.0
 **/
public class StringBufferTest {
    @Test
    public void test1(){
        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        s1.append('1');

        //s1.delete(2,4);

        //s1.replace(2,4,"hello");

        //s1.insert(2,false);

        //s1.reverse();
        //String str1 = s1.substring(2,4);
        //System.out.println(str1);

        System.out.println(s1);





    }
}
