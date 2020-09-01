package project3.domain;

/**
 * @author MrKino
 * @Description
 * @date 2020/8/31
 */
public class Architect extends Designer{
    private int stock;

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetails() + "\t架构师\t" + getStatus() + "\t" + getBonus() +
                "\t" + getStock() + "\t" + getEquipment().getDescription();
    }

    public String getDetailForTeam(){
        return getBaseTeamDetails() + "\t设计师\t" + getBonus() + "\t" + getStock();
    }
}
