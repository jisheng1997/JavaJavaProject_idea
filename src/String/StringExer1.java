package String;

/**
 * @ClassName : StringExer1
 * @Description :
 * @Author : MrKino
 * @Date : 2020/9/2 15:52
 * @Version : 1.0
 **/
public class StringExer1 {
    String str = new String("good");
    char[] chars = {'t','e','s','t'};

    public void change(String str,char ch[]){
        System.out.println(str);
        str  = "test ok";//str2 = str,str2 = "test ok"
        System.out.println(str);
        ch[0] = 'b';
    }

    public static void main(String[] args) {
        StringExer1 stringExer1 = new StringExer1();
        stringExer1.change(stringExer1.str, stringExer1.chars);
        System.out.println("*********************");
        System.out.println(stringExer1.str + "end");
        System.out.println(stringExer1.str);
        System.out.println(stringExer1.chars);
    }

}
