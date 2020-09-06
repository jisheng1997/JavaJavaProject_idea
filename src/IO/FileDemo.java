package IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName : file
 * @Description :
 * @Author : MrKino
 * @Date : 2020/9/5 20:20
 * @Version : 1.0
 **/
public class FileDemo {
    @Test
    public void test1() throws IOException {
        File file = new File("C:\\Users\\User\\Desktop\\io\\hello.txt");
        //创建一个与file目录下的另外一个文件，文件名为：haha.txt
        File destFile = new File(file.getParent(),"haha.txt");
        boolean newfile = destFile.createNewFile();
        if (newfile){
            System.out.println("创建成功");
        }
    }

    @Test
    public void test2(){
        
    }


}
