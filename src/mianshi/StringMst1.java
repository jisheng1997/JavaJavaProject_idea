package mianshi;

import org.junit.Test;

/**
 * @ClassName : StringMst1
 * @Description :  String 面试题1：将一个字符串进行反转，部分反转
 * @Author : MrKino
 * @Date : 2020/9/2 20:36
 * @Version : 1.0
 **/
public class StringMst1 {
    //方式一：
    public String reverse1(String string,int startIndex,int endIndex){
        if(string !=null && string.length() !=0){
            char[] chars = string.toCharArray();
            for (int x = startIndex,y = endIndex;x<y;x++,y--){
                char temp = chars[x];
                chars[x] = chars[y];
                chars[y] = temp;
            }
            return new String(chars);
        }
        return null;
    }

    //方式二 使用String的拼接操作
    public String reverse2(String string,int startIndex,int endIndex) {
        if (string !=null && string.length() !=0){
            String reverseStr = string.substring(0,startIndex);
            for (int i = endIndex;i>=startIndex;i--){
                reverseStr += string.charAt(i);
            }
            reverseStr += string.substring(endIndex+1);
            return reverseStr;
        }
        return null;
    }

    //方式三：使用StringBuffer替换String
    public String reverse3(String string,int startIndex,int endIndex) {
        if (string !=null && string.length() !=0){
            StringBuilder builder = new StringBuilder(string.length());
            builder.append(string.substring(0,startIndex));
            for (int i = endIndex;i>=startIndex;i--){
                builder.append(string.charAt(i));
            }
            builder.append(string.substring(endIndex+1));
            return builder.toString();
        }
        return null;
    }

    @Test
    public void test1(){
        String str = "abcedfg";
        String str2 = reverse1(str,2,5);
        String str3 = reverse2(str,2,5);
        String str4 = reverse3(str,2,5);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
