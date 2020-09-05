package mianshi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName : CollectionMst1
 * @Description :
 * @Author : MrKino
 * @Date : 2020/9/3 20:28
 * @Version : 1.0
 **/
public class CollectionMst1 {

    @Test
    public void testListRemove(){
        List list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    private void updateList(List list){
        //list.remove(2);
        list.remove(Integer.valueOf(2));
    }
}
