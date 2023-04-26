package minitest.Bai2.controller;
import minitest.Bai2.service.StudentManage;

import java.io.IOException;
import java.util.Scanner;

public class MySystem {
    public static void main(String[] args) throws IOException {
        StudentManage studentManage = new StudentManage();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("---MENU---");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Search");
            System.out.println("5. DisplayAll");
            System.out.println("6. Display Student by id");
            System.out.println("7. Display Student by classroom");
            System.out.println("8. Display Student highest point ");
            System.out.println("9. Display Student lowest score");
            System.out.println("10. Display Student rank");
            System.out.println("11. Display Student by gender");
            System.out.println("12. Add Class");
            System.out.println("13. Update Class");
            System.out.println("0. Exit");
            System.out.println(" Enter choose");
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
                case 5:
                    studentManage.displayStudent();
                    break;
                case 6 :
                    studentManage.displayStudentById();
                    break;
                case 7 :
                    studentManage.displayStudentByClass();
                    break;
                case 8 :
                    studentManage.displayHighestPoint();
                    break;
                case 9 :
                    studentManage.displayLowestScore();
                    break;
                case 10:
                    studentManage.displayRank();
                    break;
                case 11:
                    studentManage.displayStudentByGender();
                    break;
                case 12:
                    studentManage.addClass();
                    break;
                case 13:
                    studentManage.updateClass();
                    break;
                case 0 :
                    System.exit(0);
            }
        } while (true);

    }
}
