package day5_4;

import java.util.Scanner;

public class BaiTap6Day3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int j = scanner.nextInt();
        int sum = 0;
        int [][]arr = {{2,4,5},{7,8,6},{4,2,5}};
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][j];
        }
        System.out.println(sum);
    }
}
