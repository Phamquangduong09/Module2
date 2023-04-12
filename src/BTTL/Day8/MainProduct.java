package BTTL.Day8;

import java.util.Arrays;
import java.util.Scanner;

import static BTTL.Day5.Product.scanner;

public class MainProduct {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Brand brand1 = new Brand(1, "Apple");
        Brand brand2 = new Brand(2, "SamSung");
        Brand brand3 = new Brand(3, "Xiaomi");
        Brand[] brands = {brand1, brand2, brand3};
        System.out.println("Nhập số luợng sản phẩm :");
        int n = Integer.parseInt(scanner.nextLine());
        Product[] products = new Product[n];
        for (int i = 0; i < products.length; i++) {
            products[i] = getProduct(brands);
        }
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public static Product getProduct(Brand[] brands) {
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập giá :");
        double price = scanner.nextDouble();
        System.out.println("Nhập mô tả :");
        scanner.nextLine();
        String description = scanner.nextLine();
        for (int i = 0; i < brands.length; i++) {
            System.out.println(brands[i]);
        }
        System.out.println("Nhập hãng bạn muốn chọn :");
        int choice = Integer.parseInt(scanner.nextLine());
        Brand newBrand = new Brand();
        switch (choice) {
            case 1:
                newBrand = brands[0];
                break;
            case 2:
                newBrand = brands[1];
                break;
            case 3:
                newBrand = brands[2];
                break;
            default:
                System.out.println("Không có  thông tin bạn cần !!");
        }
        return new Product(name, price, description, newBrand);
    }
}
