package BTTL.Day9;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        PhoneBookManager phoneBookManager = new PhoneBookManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên bạn muốn xóa");
        String name1 = scanner.nextLine();
        phoneBookManager.updatePhone(name1);
    }
}

