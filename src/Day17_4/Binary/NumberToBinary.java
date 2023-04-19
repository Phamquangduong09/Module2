package Day17_4.Binary;

import java.util.Scanner;
import java.util.Stack;

public class NumberToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên dương :");
        int x = scanner.nextInt();
        while (x > 0) {
            int binary = x % 2;
            stack.push(binary);
            x = x / 2;
        }
        int number = stack.size();
        System.out.println("Số hệ nhị phân");
        for (int i = 0; i < number; i++) {
            System.out.println(stack.pop());
        }
    }
}
