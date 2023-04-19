package Day18_4.Baitap1;

public class Product {
    private int id ;
    private static int INDEX = 1;
    private String name;
    private double price ;

    public Product() {
    }

    public Product( String name, double price) {
        this.id = INDEX++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getINDEX() {
        return INDEX;
    }

    public static void setINDEX(int INDEX) {
        Product.INDEX = INDEX;
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

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name +
                ", price=" + price ;
    }
}
