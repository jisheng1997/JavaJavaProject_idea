package comparable;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @ClassName : CompareTest
 * @Description :
 * @Author : MrKino
 * @Date : 2020/9/3 10:19
 * @Version : 1.0
 **/
public class CompareTest {
    @Test
    public void Test1(){
        Good[] goods = new Good[5];
        goods[0] = new Good("lenovo",34);
        goods[1] = new Good("huawei",57);
        goods[2] = new Good("xiaomi",12);
        goods[3] = new Good("oppo",24);
        goods[4] = new Good("huawei",24);
        Arrays.sort(goods, new Comparator<Good>() {
            @Override
            public int compare(Good good1, Good good2) {
                if (good1.getName().equals(good2.getName())){
                    return -Double.compare(good1.getPrice(),good2.getPrice());
                }else {
                    return good1.getName().compareTo(good2.getName());
                }
            }
        });
        System.out.println(Arrays.toString(goods));
    }

    @Test
    public void Test2(){
        String[] arr = new String[]{"EE","AA","GG","CC","BB"};
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1 != null && s2 != null){
                    return -s1.compareTo(s2);//从大到小排序
                }
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
