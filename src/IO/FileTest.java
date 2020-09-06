package IO;

import org.junit.Test;

import java.io.File;

/**
 * @ClassName : FileTest
 * @Description : 测试file类的使用
 * @Author : MrKino
 * @Date : 2020/9/5 19:46
 * @Version : 1.0
 **/
public class FileTest {
    @Test
    public void test1(){
        File file = new File("C:\\Users\\User\\Desktop\\hello.txt");
        System.out.println(file);
    }

    @Test
    public void test2() {
        File file1 = new File("hello.txt");
        File file2 = new File("C:\\Users\\User\\Desktop\\hello.txt");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getPath());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
        System.out.println("****************************");

        System.out.println(file2.getAbsolutePath());
        System.out.println(file2.getPath());
        System.out.println(file2.getName());
        System.out.println(file2.getParent());
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
    }

    @Test
    public void test3(){
        File file2 = new File("C:\\Users\\User\\Desktop");

        String[] list = file2.list();
        for (String s:list){
            System.out.println(s);
        }

        System.out.println();

        File[] lists = file2.listFiles();
        for (File f:lists){
            System.out.println(f);
        }
    }

    @Test
    public void test4(){

    }
}
