package day25_4.Baitap;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> arrProduct = new ArrayList<>();
        Product product1 = new Product("Bim bim", 10000, "Oishi", "Good");
        Product product2 = new Product("Drink", 55000, "Hightland", "Good");
        Product product3 = new Product("Candy", 26000, "Orion", "Good");
        arrProduct.add(product1);
        arrProduct.add(product2);
        arrProduct.add(product3);
        try {
            outputStream(arrProduct);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
          arrProduct =  inputStream();

        }catch (Exception e){
            System.out.println("Error :" + e.getMessage());
        }
        for (Product product : arrProduct) {
            System.out.println(product);
        }

    }

    public static void outputStream(ArrayList<Product> product) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("C:\\C0223i1\\Module2\\src\\Day25_4\\Baitap\\Product.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(product);
        objectOutputStream.close();
        fileOutputStream.close();

    }

    public static ArrayList<Product> inputStream() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("C:\\C0223i1\\Module2\\src\\Day25_4\\Baitap\\Product.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        ArrayList<Product> arrayList = (ArrayList<Product>) objectInputStream.readObject();
        objectInputStream.close();
        fileInputStream.close();
        return arrayList;
    }
}

