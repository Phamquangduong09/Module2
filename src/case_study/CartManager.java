package case_study;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartManager {
    Scanner scanner = new Scanner(System.in);
    List<Cart> carts;
    List<ShoppingCart> shoppingCarts;
    ProductManager productManager;

    public CartManager(ProductManager productManager) {
        carts = new ArrayList<>();
        shoppingCarts = new ArrayList<>();
        this.productManager = productManager;
    }

    public void shopping() {
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        Cart cart = new Cart(name);
        for (Cart c : carts) {
            if (c.getName().equals(name) && !c.isPaid()) {
                cart = c;
            }
        }
        productManager.display();
        Product p = productManager.getById();
        System.out.println("Enter the product you want to buy");
        int quantity = Integer.parseInt(scanner.nextLine());
        addCart(p, quantity, cart);
    }

    public void addCart(Product product, int quantity, Cart cart) {
        ShoppingCart s = new ShoppingCart(cart, product, quantity);
        shoppingCarts.add(s);
    }

    public void displayCart() {
        double sum = 0;
        for (ShoppingCart s : shoppingCarts) {
            sum += s.getProduct().getPrice() * s.getQuantity();
            System.out.println(s);
            System.out.println(sum);
        }
    }

}
