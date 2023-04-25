package Day25_4.DemoCode;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jhin", 20);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("C:\\C0223i1\\Module2\\src\\Day25_4\\DemoCode\\Student.txt");
            ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutputStream);
            objectOutput.writeObject(student);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
