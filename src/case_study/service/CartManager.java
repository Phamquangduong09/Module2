package case_study.service;

import case_study.model.Product;
import case_study.model.Cart;
import case_study.model.ShoppingCart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CartManager {
    Scanner scanner = new Scanner(System.in);
    List<Cart> carts;
    List<ShoppingCart> shoppingCarts;
    ProductManager productManager;
    FileManager fileManager;

    public CartManager(ProductManager productManager) {
        fileManager = new FileManager();
        carts = new ArrayList<>();
        shoppingCarts = new ArrayList<>();
        fileManager.readFileCart(shoppingCarts);
        this.productManager = productManager;
        checkDefaultIndex();
    }

    public void shopping() {
        System.out.println("Enter buyer's name: ");
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
        }
        System.out.println(sum);
    }

    public void deleteCart() {
        int id;
        boolean flag = false;
        do {
            try {
                System.out.println("Enter id you want: ");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Have error, please try again!");
            }
        } while (true);
        for (int i = 0; i < shoppingCarts.size(); i++) {
            if (id == shoppingCarts.get(i).getId()) {
                shoppingCarts.remove(i);
                flag = true;
            }
        }
        if (flag) {
            System.out.println("No id you want to delete");
        }
        fileManager.writeFileCart(shoppingCarts);
    }

    private void checkDefaultIndex() {
        if (shoppingCarts.isEmpty()) {
            ShoppingCart.idUpShoppingCart = 0;
        } else {
            Product.idUp = shoppingCarts.get(shoppingCarts.size() - 1).getId();
        }
    }

}
