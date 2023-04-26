package btvn.Day4;

import java.util.Arrays;
import java.util.Scanner;

//Khai báo mảng 2 chiều nhập từ bàn phím
public class Day4Baitap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr1 = new int[2][2];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.println("Nhập vào phần tử " + i + " " + j + " của mảng thứ 1 ");
                arr1[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }
    }
}