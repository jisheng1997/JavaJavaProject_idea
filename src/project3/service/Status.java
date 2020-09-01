package project3.service;

/**
 * @Description 表示员工的状态
 * @author MrKino
 * @Description
 * @date 2020/8/31
 */
public class Status {
    private final String NAME;
    private Status(String name){
        this.NAME = name;
    }
    public static final Status FREE = new Status("FREE");
    public static final Status BUSY = new Status("BUSY");
    public static final Status VOCATION = new Status("VOCATION");

    @Override
    public String toString() {
        return NAME;
    }

    public String getNAME() {
        return NAME;
    }
}
