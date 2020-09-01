package project3.domain;

/**
 * @author MrKino
 * @Description
 * @date 2020/8/31
 */
public class PC implements Equipment {
    private String model;
    private String display;

    public PC(String model, String display) {
        this.model = model;
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getDescription() {
        return model + "(" + display + ")";
    }
}
