package sort;

public class BubbleSortTest {
    //数组的冒泡排序
    public static void main(String[]args){
        int [] arr = new int[]{34,56,73,-32,36,67,99,107,212,-65,-107};
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
