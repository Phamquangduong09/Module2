package BTTL.Day8;

import java.util.Scanner;

public class Product {
    private double id;
    private double idtemp = 1;
    private String name;
    private double price;

    private String description;
    private Brand brand;

    public Product() {
        idtemp++;
    }

    public Product(String name, double price, String description, Brand brand) {
        this.id = idtemp++;
        this.name = name;
        this.price = price;
        this.description = description;
        this.brand = brand;
    }

    public Product(String name, double price, String description) {
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public double getIdtemp() {
        return idtemp;
    }

    public void setIdtemp(double idtemp) {
        this.idtemp = idtemp;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product" +
                "id=" + id +
                ", name='" + name +
                ", price=" + price +
                ", description='" + description +
                ", brand=" + brand;

    }


}