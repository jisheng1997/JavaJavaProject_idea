package mianshi;

import org.junit.Test;

/**
 * @ClassName : StringMst3
 * @Description :  获取两个字符串中最大相同子串
 * @Author : MrKino
 * @Date : 2020/9/2 21:06
 * @Version : 1.0
 **/
public class StringMst3 {
    @Test
    public void test1(){
        String str1 = "adsagasdgadhgerhelloasfasdf";
        String str2 = "asghellodf";
        System.out.println(getMaxSameString(str1,str2));
    }

    public String getMaxSameString(String str1,String str2){
        if (str1 != null && str2!= null){
            String maxStr = (str1.length()>=str2.length())?str1:str2;
            String minStr = (str1.length()<str2.length())?str1:str2;
            int length = minStr.length();
            for (int i = 0;i<length;i++){
                for (int x = 0,y = length-i;y<=length;x++,y++){
                    String subStr = minStr.substring(x,y);
                    if (maxStr.contains(subStr)){
                        return subStr;
                    }
                }
            }
        }
        return null;
    }
}
