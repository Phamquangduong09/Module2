package Day24_4.Baitap1;

import java.io.*;

public class CopyText {
    public static void main(String[] args) throws FileNotFoundException {
        try {

            File file = new File("C:\\C0223i1\\Module2\\src\\Day24_4\\Baitap\\TextA");
            if (file.exists()) {
                FileReader reader = new FileReader(file);
                FileWriter writer = new FileWriter("C:\\C0223i1\\Module2\\src\\Day24_4\\Baitap\\TextB");
                BufferedReader br = new BufferedReader(reader);
                BufferedWriter brw = new BufferedWriter(writer);
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    brw.write(line + "\n");
                }
                br.close();
                brw.close();
            }else {
                throw new FileNotFoundException("Does not exist");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
