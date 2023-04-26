package day25_4.Baitap;

import java.io.Serializable;

public class Product implements Serializable {
    private static int idUp=1;
    private int productCode;
    private String name;
    private int price;
    private String manufacturer;
    private  String describe;

    public Product() {
    }

    public Product( String name, int price, String manufacturer, String describe) {
        this.productCode = idUp++;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.describe = describe;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode=" + productCode +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", describe='" + describe + '\'' +
                '}';
    }
}
