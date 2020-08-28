package array;

public class YangHuiTest {
    public static void main(String[] args) {
        //输出杨辉三角
        //初始化
        int[][] yanghui  = new int[10][];
        for (int i = 0; i <yanghui.length;i++) {
            yanghui[i] = new int[i+1];
            yanghui[i][0] = yanghui[i][i] = 1;
                for (int j = 1;j<yanghui[i].length-1;j++){
                yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
                }
            }
        for (int[]i:yanghui){
            for (int j:i){
                System.out.print(j+"\t");
            }
            System.out.println();
        }

    }
}
