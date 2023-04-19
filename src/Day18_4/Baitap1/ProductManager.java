package Day18_4.Baitap1;

import java.util.ArrayList;


public class ProductManager extends Products implements InterfaceProduct {
    ArrayList<Product> products = new ArrayList<>();
    Product product1 = new Product("Bim bim", 10.0);
    Product product2 = new Product("Drink", 32.0);
    Product product3 = new Product("Candy", 23.0);


    public ProductManager() {
        products.add(product1);
        products.add(product2);
        products.add(product3);
    }

    public ProductManager(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public void search() {

    }

    @Override
    public void increaseProduct() {

    }

    @Override
    public void reduceProduct() {

    }

    @Override
    void addProduct() {
        super.addProduct();
    }

    @Override
    void editProduct() {
        super.editProduct();
    }

    @Override
    void deleteProduct() {
        super.deleteProduct();
    }

    @Override
    void displayProduct() {
        for (Product p : products) {
            System.out.println(p);

        }

    }
}
