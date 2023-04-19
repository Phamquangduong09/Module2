package Minitest.Bai2;

import java.util.Scanner;

public class MySystem {
    public static void main(String[] args) {
        StudentManage studentManage = new StudentManage();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("---MENU---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search");
            System.out.println("5. DisplayAll");
            System.out.println("5. Enter choose");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentManage.addStudent();
                    break;
                case 2:
                    studentManage.updateStudent();
                    break;
                case 3:
                    studentManage.deleteStudent();
                    break;
                case 4:
                    studentManage.search();
                    break;
            }


        } while (true);

    }
}
