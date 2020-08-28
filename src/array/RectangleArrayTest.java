package array;

import java.util.Scanner;

public class RectangleArrayTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int [][] rectangleArray = new int[len][len];
        int num = len * len;
        // 1向右，2向下，3向左，4向上
        int k = 1;
        int i = 0;
        int j= 0;
        for (int m = 1;m<=num;m++){
            switch (k){
                case 1:
                    if (j<len&&rectangleArray[i][j]==0){
                        rectangleArray[i][j++] = m;
                    }else{
                        k = 2;
                        i++;
                        j--;
                        m--;
                    }
                    break;
                case 2:
                    if (i<len&&rectangleArray[i][j]==0){
                        rectangleArray[i++][j] = m;
                    }else{
                        k = 3;
                        i--;
                        j--;
                        m--;
                    }
                    break;
                case 3:
                    if (j>=0&&rectangleArray[i][j]==0){
                        rectangleArray[i][j--] = m;
                    }else{
                        k = 4;
                        i--;
                        j++;
                        m--;
                    }
                    break;
                case 4:
                    if (i>=0&&rectangleArray[i][j]==0){
                        rectangleArray[i--][j] = m;
                    }else{
                        k = 1;
                        i++;
                        j++;
                        m--;
                    }
                    break;
            }
        }
        //for (int a = 0;a<rectangleArray.length;a++){
        //    for (int b = 0;b<rectangleArray[a].length;b++){
        //        System.out.print(rectangleArray[a][b]+"\t");
        //    }
        //    System.out.println();
        //}
    }
}
