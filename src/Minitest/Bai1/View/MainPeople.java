package Minitest.Bai1.View;

import Minitest.Bai1.Controller.PeopleManager;

import java.util.Scanner;

public class MainPeople {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        PeopleManager peopleManager = new PeopleManager();
        do {
            System.out.println("----Menu----");
            System.out.println("1.Hiển thị ");
            System.out.println("2.Thêm mới ");
            System.out.println("3.Tìm kiếm ");
            System.out.println("4.Xóa ");
            System.out.println("5.Sửa ");
            System.out.println("6.Sắp xếp ");
            System.out.println("7.Tổng điểm ");
            System.out.println("Nhập lựa chọn của bạn !! ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    peopleManager.displayPeople();
                    break;
                case 2:
                    System.out.println("1.Thêm People ");
                    System.out.println("2.Thêm Student ");
                    System.out.println("Nhập lựa chọn của bạn");
                    int option= Integer.parseInt(scanner.nextLine());
                    switch (option){
                        case 1:
                            peopleManager.addPeople();
                            peopleManager.displayPeople();
                            break;
                        case 2:
                            peopleManager.addStudent();
                            peopleManager.displayPeople();
                            break;
                    }
                    break;
                case 3:
                    peopleManager.search();
                    break;
                case 4:
                    peopleManager.deletePeople();
                    break;
                case 5:
                    peopleManager.editPeople();
                    break;
                case 6:
                    peopleManager.arrangeAvg();
                    break;
                case 7:
                    peopleManager.sumAvg();
                    break;
                case 0:
                    System.exit(0);
                    break;

            }

        } while (true);
    }
}
