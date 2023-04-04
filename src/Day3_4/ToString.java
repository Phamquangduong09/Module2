package Day3_4;

import java.util.Scanner;

public class ToString {
    public static void main(String[] args) {
        int day;
        int day2;
        int day3;
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập ngày muốn đổi:");
        day = number.nextInt();
        switch (day / 100) {
            case 1:
                System.out.println("One hunder");
                break;
            case 2:
                System.out.println("Two hunder");
                break;
            case 3:
                System.out.println("There hunder");
                break;
            case 4:
                System.out.println("four hunder");
                break;
            case 5 : System.out.println("five hunder");
                break;
            case 6 : System.out.println("six hunder");
                break;
            case 7 : System.out.println("seven hunder");
                break;
            case 8 : System.out.println("eight hunder");
                break;
            case 9 : System.out.println("nine hunder");
                break;
        }
    }
}
