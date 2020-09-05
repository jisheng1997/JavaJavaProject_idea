package Collection;

import oop.exer1.Account;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName : Iterator
 * @Description :
 * @Author : MrKino
 * @Date : 2020/9/3 18:37
 * @Version : 1.0
 **/
public class IteratorTest {
    @Test
    public void test1(){
        Collection collection  = new ArrayList();
        collection.add(123);
        collection.add(456);
        collection.add(new String("Tom"));
        collection.add(new String("Jerry"));
        collection.add(false);
        collection.add(new Account(1001,2000,0.03));

        //while (iterator.hasNext()){
        //    //next() 1.指针下移 2.将下移以后集合位置上的元素返回
        //    System.out.println(iterator.next());
        //}

        for (Object o : collection) {
            //next() 1.指针下移 2.将下移以后集合位置上的元素返回
            System.out.println(o);
        }
    }


}
