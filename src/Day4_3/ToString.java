package Day4_3;

import java.util.Scanner;

public class ToString {
    public static void main(String[] args) {
        int day;
        Scanner number = new Scanner(System.in);
        System.out.println("Nhập ngày muốn đổi:");
        day = number.nextInt();
        switch (day){
            case 1 : System.out.println("One");
            break;
            case 2 : System.out.println("Two");
            break;
            case 3 : System.out.println("There");
        }
    }
}
