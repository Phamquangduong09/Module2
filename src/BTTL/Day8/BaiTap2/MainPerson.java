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
            person[i] = getPerson(addresses);
        }

        do {
            System.out.println("--------Menu--------");
            System.out.println("1.Hiển thị ");
            System.out.println("2.Xóa");
            System.out.println("3.Thêm");
            System.out.println("4.Sửa");
            System.out.println("5.Sắp xếp");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    for (Person value : person) {
                        System.out.println(value);
                    }
                    break;
                case 2:
                    deletePerson(person);
                    break;
                case 3:
                    person = addPerson(person, addresses);
                    break;
                case 4:
                    editPerson(person, addresses);
                    break;
                case 5:
                    dockingPerson(person);
            }

        } while (true);
    }

    public static Person getPerson(Address[] addresses) {
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi :");
        int age = Integer.parseInt(scanner.nextLine());
        displayAddress(addresses);
        System.out.println("Nhập địa chỉ bạn muốn chọn :");
        int number = Integer.parseInt(scanner.nextLine());
        Address idAdress = new Address();
        for (Address address : addresses) {
            if (number == address.getId()) {
                idAdress = address;
            }
        }
        return new Person(name, age, idAdress);
    }

    public static Address[] displayAddress(Address[] addresses) {
        for (Address address : addresses) {
            System.out.println(address);
        }
        return addresses;
    }

    public static void deletePerson(Person[] person) {
        int j = 0;
        Person[] people = new Person[person.length - 1];
        System.out.println("Nhập nhân viên bạn muốn xóa");
        int n = Integer.parseInt(scanner.nextLine());
        for (Person value : person) {
            if (n != value.getId()) {
                people[j] = value;
                j++;
            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(people[i]);
        }
    }

    public static Person[] addPerson(Person[] person, Address[] addresses) {
        Person[] people1 = new Person[person.length + 1];
        System.arraycopy(person, 0, people1, 0, person.length);
        people1[people1.length - 1] = getPerson(addresses);
        return people1;
    }

    public static Person[] editPerson(Person[] person, Address[] addresses) {
        Address idAddress = new Address();
        System.out.println("Nhập nhân id bạn muốn sửa");
        int editId = Integer.parseInt(scanner.nextLine());
        for (Person value : person) {
            if (editId == value.getId()) {
                System.out.println("Tên bạn muốn sửa:");
                String name = scanner.nextLine();
                value.setName(name);
                System.out.println("Tuổi bạn muốn sửa:");
                int age = Integer.parseInt(scanner.nextLine());
                value.setAge(age);
                displayAddress(addresses);
                System.out.println("Nhập địa chỉ bạn muốn sửa :");
                int number = Integer.parseInt(scanner.nextLine());
                for (int i = 0; i < addresses.length; i++) {
                    if (number == addresses[i].getId()) {
                        idAddress = addresses[i];
                    }
                }
                value.setAddress(idAddress);
            }
        }
        return person;
    }

    public static Person[] dockingPerson(Person[] person) {
        Person temp = new Person();
        for (int i = 0; i < person.length; i++) {
            for (int j = i + 1; j < person.length; j++) {
                if (person[i].getName().compareTo(person[j].getName()) > 0) {
                    temp = person[i];
                    person[i] = person[j];
                    person[j] = temp;
                }
            }
        }
        return person;
    }


}