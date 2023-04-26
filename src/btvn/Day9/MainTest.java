package btvn.Day9;

import java.util.Scanner;

public class MainTest {
 public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        PhoneBookManager phoneBookManager = new PhoneBookManager();

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
                  phoneBookManager.displayContact();
                  break;
              case 2:
                  System.out.println("hãy nhập tên bạn muốn xóa");
                  String name = scanner.nextLine();
                  phoneBookManager.removePhone(name);
                  break;
              case 3:
                  phoneBookManager.insertPhone();
                  break;
              case 4:
                  System.out.println("hãy nhập tên bạn muốn sửa");
                  String name1 = scanner.nextLine();
                  phoneBookManager.updatePhone(name1);
                  break;

          }

      }while (true);
    }
}

