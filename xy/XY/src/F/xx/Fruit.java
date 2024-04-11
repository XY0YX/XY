package F.xx;

public class Fruit {
    private String name;
    private String area;
    private double price;

    // 无参构造函数

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                ", area='" + area + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fruit(String name, String area, double price) {
        this.name = name;
        this.area = area;
        this.price = price;
    }
}