package BTTL;

import java.util.Scanner;

public class Product {
    int id ;
    String name;
    int price;
    String type;
    static String USD = "USD";

    public Product() {
    }

    public Product(int id, String name, int price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product " +
                "id=" + id +
                ", name='" + name +
                ", price=" + price + USD +
                ", type='" + type ;
    }

    static Scanner scanner= new Scanner(System.in);
    public static Product getProduct() {
        System.out.println("Nhập mã: ");
        int id = scanner.nextInt();
        System.out.println("Nhập tên: ");
        String name = scanner.next();
        System.out.println("Nhập giá: ");
        int price = scanner.nextInt();
        System.out.println("Nhập loại: ");
        String type = scanner.next();
        scanner.nextLine();
        return new Product(id,name,price,type);

    }

}
