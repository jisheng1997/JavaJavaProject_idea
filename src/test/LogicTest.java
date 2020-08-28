package test;

/**
 * @author MrKino
 * @version 1.0
 * @date 2020/8/25 20:12
 */
public class LogicTest {
    public static void main(String[]args){
//        int x = 1;
//        int y = 1;
//        if(x++==2&++y==2){
//            x=7;
//        }
//        System.out.println("x="+x + ", y="+y);

        boolean x = true;
        boolean y = false;
        short z = 42;
//        if(y == true)
        if ((z++==42)&&(y=true)) z++;
        if ((x=false)||(++z==45))z++;
        System.out.println("z="+z);
    }

}
