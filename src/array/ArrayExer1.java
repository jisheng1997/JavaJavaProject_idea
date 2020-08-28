package array;

import java.util.Scanner;

public class ArrayExer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int number = scanner.nextInt();
        int scores[] = new int[number];
        System.out.println("请输入" + number + "个学生成绩");
        for (int i = 0;i<scores.length;i++){
            scores[i] = scanner.nextInt();
        }
        int maxscore = 0;
        for (int score:scores){
            maxscore = score;
        }
        System.out.println("最高成绩为：" + maxscore);
        char level;
        for (int score:scores){
            if (maxscore - score <=10){
                level = 'A';
            }else if (maxscore - score <=20){
                level = 'B';
            }else if (maxscore - score <=30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("学生成绩为：" + score + "评价为：" + level);
        }

    }
}

