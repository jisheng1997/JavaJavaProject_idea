package comparable;

/**
 * @ClassName : CompareTest
 * @Description :  对对象进行排序
 * @Author : MrKino
 * @Date : 2020/9/3 10:12
 * @Version : 1.0
 **/
public class Good implements Comparable{
    private String name;
    private double price;

    public Good() {
    }

    public Good(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //指明商品比较大小的方式
    @Override
    public int compareTo(Object o) {
        if (o instanceof Good){
            Good good = (Good)o;
            if (this.price>good.price){
                return 1;
            }else if (this.price<good.price){
                return -1;
            }else{
                return this.name.compareTo(good.name);
            }
        }
        throw new RuntimeException("传入的数据类型不一致");
    }

    @Override
    public String toString() {
        return "Good{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
