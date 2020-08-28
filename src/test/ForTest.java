package test;
/**
 * @author MrKino
 * @version 1.0
 * @date 2020/8/26 11:09
 */
import java.util.Scanner;
class ForTest {
    public static void main(String[]args){
        //int num = 1;
        //for (System.out.print("a");num<4; System.out.print("c"),num++){
        //    System.out.print("b");
        //}
        //System.out.println("\n");
        //int count = 0;
        //for (int i = 0 ; i < 101 ; i++ ){
        //    if (i%2 == 0){
        //        System.out.print(i + " ");
        //        count++;
        //    }
        //}
        //System.out.println(count);
        //
        //Scanner scanner = new Scanner(System.in);
        //int positiveNum = 0;
        //int negativeNum = 0;
        //while (true){
        //    int number = scanner.nextInt();
        //    if(number>0){
        //        positiveNum++;
        //    }else if(number<0){
        //        negativeNum++;
        //    }else{
        //        break;
        //    }
        //}
        //System.out.println("正数的个数是" + positiveNum + "  负数的个数是" + negativeNum);

        //九九乘法表
        //100以内所有的质数
        boolean isFlag = true;
        int count = 0;
        long start = System.currentTimeMillis();
        label:for (int i = 2;i <=100000;i++){
            for (int j = 2;j<=Math.sqrt(i);j++){
                if (i % j == 0){
                    continue label;
                }
            }
            count++;
        }
        long end = System.currentTimeMillis();
        System.out.println("总个数：" + count);
        System.out.println("总时间为：" + (end - start));
    }
}
