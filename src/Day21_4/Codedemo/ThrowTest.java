package Day21_4.Codedemo;

import java.util.Scanner;

public class ThrowTest {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Age");
            int number = Integer.parseInt(scanner.nextLine());
            validate(number);
        } catch (ArithmeticException name) {
            System.out.println(name.getMessage());
        }
    }

    static void validate(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException(" You must be over 18 years old ");
        } else{
            System.out.println("Hello CodeGym");
        }
    }
}
