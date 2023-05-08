package case_study;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrandManager brandManager = new BrandManager();
        ProductManager productManager = new ProductManager(brandManager);
        CartManager cartManager = new CartManager(productManager);
        int choice = -1;
        do {
            System.out.println("---MENU---");
            System.out.println("1 . Login");
            System.out.println("2 . Client");
            System.out.println("Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter the number !!");
            }
            switch (choice) {
                case 1:
                    break;
                case 2:
                    menuClient(productManager, scanner, cartManager);
                    break;
            }
        } while (true);
    }

    private static void menuBrand(Scanner scanner, BrandManager brandManager) {
        int choiceBrand = -1;
        do {
            System.out.println("--Menu Brand--");
            System.out.println("1. Add brand");
            System.out.println("2. Update brand");
            System.out.println("3. Delete brand");
            System.out.println("4. Display");
            System.out.println("0. Exit");
            try {
                choiceBrand = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter the number !!");
            }
            switch (choiceBrand) {
                case 1:
                    brandManager.add();
                    break;
                case 2:
                    brandManager.update();
                    break;
                case 3:
                    brandManager.delete();
                    break;
                case 4:
                    brandManager.display();
                    break;
            }
        } while (choiceBrand != 0);
    }

    public static void menuClient(ProductManager productManager, Scanner scanner, CartManager cartManager) {
        productManager.display();
        int choice = -1;
        do {
            System.out.println(" -- Hello my customer -- ");
            System.out.println("1 . Sort By Name");
            System.out.println("2 . Sort By Price");
            System.out.println("3 . Search");
            System.out.println("4 . Filter");
            System.out.println("5 . Cart");
            System.out.println("0. Exit");
            System.out.println("Enter your selection");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter the number !!");
            }
            switch (choice) {
                case 1:
                    productManager.sortByName();
                    break;
                case 2:
                    productManager.sortByPrice();
                    break;
                case 3:
                    productManager.search();
                    break;
                case 4:
                    productManager.filter();
                    break;
                case 5:
                    menuCart(scanner, cartManager);
                    break;
            }
        } while (choice != 0);

    }

    public static void menuCart(Scanner scanner, CartManager cartManager) {
        int choice = -1;
        do {
            System.out.println("-- Cart --");
            System.out.println("1 . Display");
            System.out.println("2 . Shopping");
            System.out.println("3 . Delete Product By Cart");
            System.out.println("0. Exit");
            System.out.println("Enter your selection");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter the number !!");
            }
            switch (choice) {
                case 1:
                    cartManager.displayCart();
                    break;
                case 2:
                    cartManager.shopping();
                    break;
                case 3:
                    cartManager.deleteCart();
                    break;
            }
        } while (choice != 0);
    }

    public static void menuAdmin() {
        int choice = -1;
        System.out.println("-- Hello Admin --");
        System.out.println("1 . Add Product");
        System.out.println("2 . Update Product");
        System.out.println("3 . Delete Product");
        System.out.println("4 . Menu Brand");

    }

}
