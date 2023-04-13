package BTTL.Day9;

import java.util.Scanner;

public class PhoneBookManager extends Phone {
    Contact[] contacts;

    public PhoneBookManager() {
        Contact[] arrContact ;
        Contact contact1 = new Contact("Duong", "01234567");
        Contact contact2 = new Contact("Thai", "78451359");
        arrContact = new Contact[]{contact1, contact2};
        contacts = arrContact;
    }

    public void displayContact() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }

    }

    @Override
    void insertPhone() {
        Contact[] contacts1 = new Contact[contacts.length + 1];
        System.arraycopy(contacts, 0, contacts1, 0, contacts1.length);
        getContact();
    }

    @Override
    void removePhone(String name) {
        int j = 0;
        Contact[] contacts2 = new Contact[contacts.length - 1];
        boolean check = false;
        if (!name.equals("")) {
            for (Contact contact : contacts) {
                if (name.equals(contact.getName())) {
                    check = true;

                    if (!name.equals(contact.getName())) {
                        contacts2[j] = contact;
                        j++;
                    }
                }
            }
            if (!check) {
                System.out.println("Không có tên bạn cần tìm");
            }
            for (int i = 0; i < j; i++) {
                System.out.println(contacts2[i]);
            }
        } else {
            System.out.println("hãy nhập tên");
        }
    }

    @Override
    void updatePhone(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if(name.equals(contacts[i].getName())){
                contacts[i]=getContact();
            }
        }
        displayContact();

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {

    }

    public static Contact getContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên :");
        String name = scanner.nextLine();
        System.out.println("nhập số điện thoại");
        String number = scanner.nextLine();
        return new Contact(name, number);
    }

}
