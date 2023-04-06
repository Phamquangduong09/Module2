package BTTL;

import java.util.Scanner;

public class DayBaiTap1_Main {
    public static void main(String[] args) {
//        Day5Baitap1 students1 = new Day5Baitap1("Duong", 24, 8, 7, 10);
//        Day5Baitap1 students2 = new Day5Baitap1("Thai", 24, 10, 10, 10);
//        Day5Baitap1 students3 = new Day5Baitap1("Ly", 24, 7, 7, 8);
//        Day5Baitap1[] students = {students1, students2, students3};
//        double max = students1.getAvg();
//        int index = 0;
//        for (int i = 0; i < students.length; i++) {
//            if (students[i].getAvg() > max) {
//                index = i;
//            }
//        }
//        System.out.println(students[index]);
        Day5Baitap1 student1 = new Day5Baitap1();
        Day5Baitap1 student2 = new Day5Baitap1();
        Day5Baitap1 student3 = new Day5Baitap1();
        Day5Baitap1[] students = {student1, student2, student3};
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= students.length; i++) {
            System.out.println(" nhập tên ");
            String ten = scanner.nextLine();
            students[i].setTen(ten);
            System.out.println(" nhập tuoi ");
            int tuoi = scanner.nextInt();
            students[i].setTuoi(tuoi);
            System.out.println(" nhập diem toan ");
            int toan = scanner.nextInt();
            students[i].setToan(toan);
            System.out.println("nhap diem ly");
            int ly = scanner.nextInt();
            students[i].setLy(ly);
            System.out.println("nhap diem hoa");
            int hoa = scanner.nextInt();
            students[i].setLy(hoa);
        }


    }
    public static Day5Baitap1 students(){
        String ten = Scanner
    }
}
