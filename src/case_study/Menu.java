package case_study;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BrandManager brandManager = new BrandManager();
        ProductManager productManager = new ProductManager(brandManager);
        do {
            System.out.println("---MENU---");
            System.out.println("1. Display Product");
            System.out.println("2. Add Product");
            System.out.println("3. Update Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Search");
            System.out.println("6. Sort by name");
            System.out.println("7. Sort by price");
            System.out.println("8. Menu Brand");
            System.out.println("0. Exit");
            System.out.println("Enter the number you want to choose");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    productManager.display();
                    break;
                case 2:
                    productManager.add();
                    break;
                case 3:
                    productManager.update();
                    break;
                case 4:
                    productManager.delete();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.sortByName();
                    break;
                case 7:
                    productManager.sortByPrice();
                    break;
                case 8:
                    menuBrand(scanner, brandManager);
                    break;
                case 0:
                    System.exit(0);

            }
        } while (true);
    }

    private static void menuBrand(Scanner scanner, BrandManager brandManager) {
        int choiceBrand;
        do {
            System.out.println("--Menu Brand--");
            System.out.println("1. Add brand");
            System.out.println("2. Update brand");
            System.out.println("3. Delete brand");
            System.out.println("4. Display");
            System.out.println("0. Exit");
            choiceBrand = Integer.parseInt(scanner.nextLine());
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
}
