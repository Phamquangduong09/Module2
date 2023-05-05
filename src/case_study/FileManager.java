package case_study;

import java.io.*;
import java.util.List;


public class FileManager {
    public void readFileProduct(List<Product> productList, BrandManager brandManager) {
        File file = new File("C:\\C0223i1\\Module2\\src\\case_study\\Product");

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] arrProduct = string.split(",");
                Brand brand = brandManager.getByNameBrand(arrProduct[4]);
                Product product = new Product(Integer.parseInt(arrProduct[0]), arrProduct[1], Double.parseDouble(arrProduct[2]),
                        brand, arrProduct[5]);
                productList.add(product);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public void writeFileProduct(List<Product> productList) {
        File file = new File("C:\\C0223i1\\Module2\\src\\case_study\\Product");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product p : productList) {
                bufferedWriter.write(p.toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void writeFileBrand(List<Brand> brandList) {
        File file = new File("C:\\C0223i1\\Module2\\src\\case_study\\Brand");
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Brand b : brandList) {
                bufferedWriter.write(b.toString() + "\n");
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void readFileBrand(List<Brand> brandList) {
        File file = new File("C:\\C0223i1\\Module2\\src\\case_study\\Brand");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                String[] arrBrand = string.split(",");
                Brand brands = new Brand(Integer.parseInt(arrBrand[0]), arrBrand[1]);
                brandList.add(brands);
            }
            bufferedReader.close();
            fileReader.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
