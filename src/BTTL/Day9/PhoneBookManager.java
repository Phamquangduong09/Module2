package BTTL.Day9;

import java.util.Scanner;

public class PhoneBookManager extends Phone implements interfaceIPhone {
    Contact[] contacts;

    public PhoneBookManager() {
        Contact[] arrContact;
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
        System.arraycopy(contacts, 0, contacts1, 0, contacts.length);
        contacts1[contacts1.length - 1] = getContact();
        contacts = contacts1;
    }

    @Override
    void removePhone(String name) {
        int j = 0;
        Contact[] contacts2 = new Contact[contacts.length - 1];
        if (!name.equals("")) {
            for (Contact contact : contacts) {
                if (!name.equals(contact.getName())) {
                    contacts2[j] = contact;
                    j++;
                }
            }
            contacts = contacts2;
            System.out.println("Xoas thanh coong");
        }
    }


    @Override
    void updatePhone(String name) {
        for (int i = 0; i < contacts.length; i++) {
            if (name.equals(contacts[i].getName())) {
                contacts[i] = getContact();
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
