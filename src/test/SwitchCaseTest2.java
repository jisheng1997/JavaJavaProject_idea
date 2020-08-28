package test;
/**
 * @author MrKino
 * @version 1.0
 * @date 2020/8/26 10:44
 */
import java.util.Scanner;
class SwitchCaseTest2 {
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入2020年的month");
        int month = scanner.nextInt();
        System.out.print("请输入2020年的day");
        int day = scanner.nextInt();
        int sumDays = 0;
        switch (month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
            System.out.println("2019年" + month + "月" + day + "日是当年的第" + sumDays + "天");

        }
    }
}
