package BTTL;

import java.util.Arrays;
import java.util.Scanner;

public class DemoProduct {
    public static void main(String[] args) {
//        Product product1 = new Product(1, "Sauvage EDT", 100, "Male");
//        Product product2 = new Product(2, "Aventus", 140, "Male");
//        Product product3 = new Product(3, "Angels’ Share", 90, "Unisex");
//        Product product4 = new Product(4, "Vetiver Santal", 110, "Male");
//        Product[] products = {product1, product2, product3, product4};
//        System.out.println(Sum(products));
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số lượng sản phẩm");
        int n = scanner.nextInt();
        Product[] products = new Product[n];
        for (int i = 0; i < products.length; i++) {
            products[i] = Product.getProduct();
        }
//        for (int i = 0; i < products.length; i++) {
////            System.out.println(products[i]);
//        }
        sort(products);
        System.out.println("Tổng tất cả các giá tiền là :" + sum(products));
        search(products);
        delete(products);
        edit(products);
    }

    public static int sum(Product[] products) {
        int sum = 0;
        for (int i = 0; i < products.length; i++) {
            sum += products[i].getPrice();
        }
        return sum;
    }

    public static void search(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập sản phẩm bạn muốn tìm :");
        String seach = scanner.nextLine();
        int index = -1;
        boolean flag = true;
        for (int i = 0; i < products.length; i++) {
            if (seach.equals(products[i].getName())) {
                index = i;
                flag = false;
            }
        }
        if (flag == true) {
            System.out.println("không tìm thấy");
        }
        System.out.println(products[index]);

    }

    public static void delete(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm bạn muốn xóa:");
        int delete = scanner.nextInt();
        Product[] arr = new Product[products.length - 1];
        int j = 0;
        for (int i = 0; i < products.length; i++) {
            if (delete != products[i].getId()) {
                arr[j] = products[i];
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void sort(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            for (int j = i + 1; j < products.length; j++) {
                if (products[i].getPrice() > products[j].getPrice()) {
                    Product temp = products[i];
                    products[i] = products[j];
                    products[j] = temp;
                }
            }
        }
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    public static void edit(Product[] products) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm bạn muốn sửa:");
        int edit = scanner.nextInt();
        for (int i = 0; i < products.length; i++) {
            if (edit == products[i].getId()) {
                products[i] = Product.getProduct();
            }
        }
        System.out.println(Arrays.toString(products));
    }
}
