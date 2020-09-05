package mianshi;

import org.junit.Test;

/**
 * @ClassName : StringMst2
 * @Description :  获取一个字符串在另一个字符串中出现的次数
 * @Author : MrKino
 * @Date : 2020/9/2 20:53
 * @Version : 1.0
 **/
public class StringMst2 {
    @Test
    public void test1(){
        String str1 = "absdfadbaabdhewabhteavab";
        System.out.println(getCount(str1,"ab"));
    }

    public int getCount(String mainStr,String subStr){
        int count = 0;
        int index = 0;
        if (mainStr.length()>=subStr.length()){
            //方式一:
            //while ((index = mainStr.indexOf(subStr))!=-1){
            //    count++;
            //    mainStr = mainStr.substring(index+subStr.length());
            //}
            //方式二：对方式一的改进
            while ((index = mainStr.indexOf(subStr,index))!=-1){
                count++;
                index+=subStr.length();
            }
            return count;
        }else{
            return 0;
        }
    }

}
