package Day17_4.BaiTap1;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi");
        String string = scanner.nextLine();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i) + "");
        }
        System.out.println("chuỗi đã đảo ngược");
        for (int i = 0; i < string.length(); i++) {
            System.out.println(stack.pop());

        }
    }
}
