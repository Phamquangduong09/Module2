package Day21_4.Codedemo;

import java.util.Scanner;

public class Throws {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Age");
            int number = Integer.parseInt(scanner.nextLine());
            checkAge(number);
        } catch (MyException name) {
            System.out.println(name.getError());
        }
    }
    public static void checkAge(int age) throws MyException{
        if(age > 18 ){
            System.out.println("Hello CodeGym >.<");
        }else {
            throw new MyException("You must be over 18 years old !!!!");
        }
    }
}
