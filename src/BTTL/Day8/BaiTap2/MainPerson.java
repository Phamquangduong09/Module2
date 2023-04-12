package BTTL.Day8.BaiTap2;

import java.util.Scanner;

import static BTTL.Day5.Product.scanner;

public class MainPerson {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Address address1 = new Address("Hà Nội");
        Address address2 = new Address("HCM");
        Address[] addresses = {address1, address2};
        System.out.println("Nhập số lượng học sinh :");
        int n = Integer.parseInt(scanner.nextLine());
        Person[] person = new Person[n];
        for (int i = 0; i < person.length; i++) {
            person[i]=addPerson(addresses);
        }

        do {
            System.out.println("--------Menu--------");
            System.out.println("1.Hiển thị ");
            System.out.println("2.Xóa");
            System.out.println("3.Thêm");
            System.out.println("4.Sửa");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    for (int i = 0; i < person.length; i++) {
                        System.out.println(person[i]);
                    }
                    break;
                case 2:
            }

        }while (true);
    }

    public static Person addPerson(Address[] addresses) {
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi :");
        int age = Integer.parseInt(scanner.nextLine());
        displayAddress(addresses);
        System.out.println("Nhập địa chỉ bạn muốn chọn :");
        int number = Integer.parseInt(scanner.nextLine());
        Address idAdress = new Address();
        for (int i = 0; i < addresses.length; i++) {
            if (number == addresses[i].getId()) {
                idAdress = addresses[i];
            }
        }
        return new Person( name, age, idAdress);
    }

    public static Address[] displayAddress(Address[] addresses) {
        for (int i = 0; i < addresses.length; i++) {
            System.out.println(addresses[i]);
        }
        return addresses;
    }
    public static void deletePerson(Person[]person){
        int j = 0;
        Person [] people = new Person[person.length-1];
        System.out.println("Nhập nhân viên bạn mmuốn xóa");
        int n = scanner.nextInt();
        for (int i = 0; i < person.length; i++) {
            if ( n != person[i].getId()){
                people[j]= person[i];
            }
        }
    }
}
