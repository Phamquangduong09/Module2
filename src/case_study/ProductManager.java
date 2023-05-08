package case_study;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements Manager, Feature {

    private final List<Product> productList;
    private final Scanner scanner;
    private final BrandManager brandManager;
    FileManager fileManager;

    public ProductManager(BrandManager brandManager) {
        productList = new ArrayList<>();
        scanner = new Scanner(System.in);
        this.brandManager = brandManager;
        fileManager = new FileManager();
        fileManager.readFileProduct(productList, brandManager);
        checkDefaultIndex();
    }

    @Override
    public List<Product> add() {

        System.out.println("Enter name");
        String name = scanner.nextLine();
        double price;
        while (true) {
            System.out.println("Enter price");
            try {
                price = Double.parseDouble(scanner.nextLine());
                if (price < 0) {
                    throw new NumberFormatException();
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }
        Brand brand = getBrand();
        System.out.println("Enter describe");
        String describe = scanner.nextLine();
        Product product = new Product(name, price, brand, describe);
        productList.add(product);
        fileManager.writeFileProduct(productList);
        return productList;
    }

    @Override
    public List<Product> update() {
        Product product = getById();
        if (product != null) {
            System.out.println("Enter name");
            String name = scanner.nextLine();
            if (!name.equals("")) {
                product.setName(name);
            }
            double price;
            while (true) {
                System.out.println("Enter price");
                try {
                    price = Double.parseDouble(scanner.nextLine());
                    if (price > 0) {
                        product.setPrice(price);
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Please re-enter the number!");
                }
            }
            brandManager.display();
            System.out.println("Enter brand ");
            product.setBrand(getBrand());
            System.out.println("Enter describe");
            String describe = scanner.nextLine();
            product.setDescribe(describe);
        }
        fileManager.writeFileProduct(productList);
        return productList;
    }

    @Override
    public List<Product> delete() {
        Product product = getById();
        if (product != null) {
            productList.remove(product);
        }
        fileManager.writeFileProduct(productList);
        return productList;
    }

    @Override
    public void display() {
        System.out.printf("%-15s%-15s%-15s%-18s%s",
                "Id", "Name", "Brand", "Price", "Description\n");

        for (Product p : productList) {
            p.display();
        }
    }

    @Override
    public void sortByName() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    public void sortByPrice() {
        productList.sort(new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
    }

    @Override
    public void search() {
        System.out.println("Enter the name you want to search :");
        String name = scanner.nextLine();
        for (Product p : productList) {
            if (p.getName().contains(name)) {
                System.out.println(p);
            }
        }

    }

    public Product getById() {
        int id;
        do {
            try {
                System.out.println("Enter id you want: ");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.err.println("Have error, please try again!");
            }
        } while (true);
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    private Brand getBrand() {
        brandManager.display();
        Brand brand;
        do {
            brand = brandManager.getByIdBrand();
        } while (brand == null);
        return brand;
    }

    private void checkDefaultIndex() {
        if (productList.isEmpty()) {
            Product.idUp = 0;
        } else {
            Product.idUp = productList.get(productList.size() - 1).getId();
        }
    }

    public void filter() {
        double lowestPrice;
        double highestPrice;
        String name = "";
        do {
            try {
                System.out.println("Enter Lowest price");
                String a = scanner.nextLine();
                if (a.equals("")) {
                    lowestPrice = 0;
                } else {
                    lowestPrice = Double.parseDouble(a);
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
        do {
            try {
                System.out.println("Enter highest price");
                String price = scanner.nextLine();
                if (price.equals("")) {
                    highestPrice = Double.MAX_VALUE;
                    break;
                } else {
                    highestPrice = Double.parseDouble(price);
                    if (highestPrice > lowestPrice) {
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Enter name brand");
            name = scanner.nextLine();
        } while (true);
        filterPrice(lowestPrice,highestPrice,name);
    }

    public void filterPrice(double lowestPrice, double highestPrice, String name) {
        for (Product s : productList) {
            if (lowestPrice < s.getPrice() && s.getPrice() < highestPrice) {
                if(!name.equals("") && s.getBrand().getBrandName().contains(name)){
                    System.out.println(s);
                }else {
                    System.out.println(s);
                }

            }
        }
    }
}
