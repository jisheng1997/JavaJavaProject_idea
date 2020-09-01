package project3.service;

/**
 * @ClassName : TeamException
 * @Description : 自定义异常类
 * @Author : MrKino
 * @Date : 2020/8/31 22:43
 * @Version : 1.0
 **/
public class TeamException extends Exception{
    static final long serialVersionUID = -338124229948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
