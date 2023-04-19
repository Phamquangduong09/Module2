package Day18_4.Baitap1;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
      do{
          System.out.println("---MENU---");
          System.out.println("1 . Display ");
          System.out.println("2 . Add Product");
          System.out.println("3 . Search Product");
          System.out.println("4 . Delete Product");
          System.out.println("5 . Update Product");
          System.out.println("6 . Increase Product");
          System.out.println("7 . Reduce Product");
          System.out.println("Enter your selection");
          Scanner scanner = new Scanner(System.in);
          int choice = Integer.parseInt(scanner.nextLine());
          switch (choice){
              case 1:
                  productManager.displayProduct();
                  break;
              case 2:
              case 3:
              case 4:
              case 5:
              case 6:
          }
      }while (true);
    }
}
