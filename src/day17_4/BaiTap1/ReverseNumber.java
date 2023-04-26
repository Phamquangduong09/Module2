package day17_4.BaiTap1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseNumber {
    public static void main(String[] args) {
        Stack <Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng :");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử của mảng");
            int number = scanner.nextInt();
            stack.push(number);
        }
        System.out.println("Mảng đảo ngược là :");
        for (int i = 0; i <n; i++) {
            System.out.println(stack.pop());
        }
    }
}
