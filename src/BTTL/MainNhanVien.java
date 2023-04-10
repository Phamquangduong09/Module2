package BTTL;

import java.util.Arrays;
import java.util.Scanner;

import static BTTL.Product.scanner;

public class MainNhanVien {
    public static void main(String[] args) {
        PartTime partTime1 = new PartTime(1, "a", 23, 74);
        PartTime partTime2 = new PartTime(2, "b", 23, 46);
        FullTime fullTime1 = new FullTime(3, "c", 27, 2);
        NhanVien[] nhanViens = new NhanVien[3];
        nhanViens[0] = partTime1;
        nhanViens[1] = partTime2;
        nhanViens[2] = fullTime1;
        do {
            System.out.println("---------Menu---------");
            System.out.println("1.Hiển thị nv parttime");
            System.out.println("2.Hiển thị nv fulltime");
            System.out.println("3.Xóa nhân viên");
            System.out.println("4.Thêm mới nhân viên");
            System.out.println("5.Sửa nhân viên");
            System.out.println("0.Thoát");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayPartTime(nhanViens);
                    break;
                case 2:
                    displayFullTime(nhanViens);
                    break;
                case 3:
                    deleteNhanVien(nhanViens);
                    break;
                case 4:
                    nhanViens = addNhanVien(nhanViens);
                    break;
                case 5 :
                    editNhanVien(nhanViens);
                case 0:
                    System.exit(0);
            }
        }
        while (true);
    }

    public static void displayPartTime(NhanVien[] nhanViens) {
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof PartTime) {
                System.out.println(nhanViens[i]);
            }
        }
    }

    public static void displayFullTime(NhanVien[] nhanViens) {
        for (int i = 0; i < nhanViens.length; i++) {
            if (nhanViens[i] instanceof FullTime) {
                System.out.println(nhanViens[i]);
            }
        }
    }

    public static void deleteNhanVien(NhanVien[] nhanViens) {
        int j = 0;
        NhanVien[] nhanViens1 = new NhanVien[nhanViens.length - 1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập nhân viên bạn mmuốn xóa");
        int n = scanner.nextInt();
        for (int i = 0; i < nhanViens.length; i++) {
            if (n != nhanViens[i].getId()) {
                nhanViens1[j] = nhanViens[i];
                j++;
            }
        }
        for (int k = 0; k < j; k++) {
            System.out.println(nhanViens1[k]);
        }
    }

    public static NhanVien[] addNhanVien(NhanVien[] nhanViens) {
        NhanVien[] nhanViens2 = new NhanVien[nhanViens.length + 1];
        for (int i = 0; i < nhanViens.length; i++) {
            nhanViens2[i] = nhanViens[i];
        }
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Nhập 1 để add FullTime ");
        System.out.println("Nhập 2 để add PartTime ");
        int choice1 = Integer.parseInt(scanner.nextLine());
        switch (choice1) {
            case 1:
                FullTime fullTime = new FullTime(4, "f", 45, 7);
                nhanViens2[nhanViens2.length - 1] = fullTime;
                break;
            case 2:
                PartTime partTime = new PartTime(4, "h", 43, 800);
                nhanViens2[nhanViens2.length - 1] = partTime;
                break;
        }
        return nhanViens2;
    }

    public static void editNhanVien(NhanVien[] nhanViens) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id sản phẩm bạn muốn sửa:");
        int edit = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < nhanViens.length; i++) {
            if (edit == nhanViens[i].getId()) {
                System.out.println("Name");
                String name = scanner.nextLine();
                nhanViens[i].setName(name);
                System.out.println("Age");
                int age= scanner.nextInt();
                nhanViens[i].setAge(age);
                if (nhanViens[i] instanceof FullTime){
                    System.out.println("Giờ làm");
                    int time = scanner.nextInt();
                   ((FullTime) nhanViens[i]).setYearsOfExp(time);
                }else {
                    System.out.println("Giờ làm");
                    int time = scanner.nextInt();
                    ((PartTime) nhanViens[i]).setWorkTime(time);
                }
            }
        }
        System.out.println(Arrays.toString(nhanViens));
    }
}
